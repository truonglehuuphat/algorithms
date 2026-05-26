import pandas as pd

def combine_two_tables(person: pd.DataFrame, address: pd.DataFrame) -> pd.DataFrame:
    ans = pd.merge(person, address, on='personId', how='left')
    res = ans[['firstName', 'lastName', 'city', 'state']]
    return res