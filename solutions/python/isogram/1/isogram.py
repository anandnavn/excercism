def is_isogram(phrase):
    """
    find isograms
        """
    root = phrase.lower().replace('-','').replace(' ','')
    i=0
    j=1
    while i<len(phrase):
        while j<len(root):
            if root[i] == root[j]:
                return False
            else: j = j + 1
    
        i = i + 1
        j = i + 1
    
    return True