def is_isogram(phrase):
    """Return True if no letter repeats (ignoring case, spaces and hyphens)."""
    letters = [char for char in phrase.lower() if char.isalpha()]
    return len(letters) == len(set(letters))