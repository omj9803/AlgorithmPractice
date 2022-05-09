def solution(atmos):
    mask_use = 0
    count = 0
    for day in atmos:
        if day[0] >= 81 or day[1] >= 36:
            # 새로 사용하는 경우 count + 1
            if mask_use == 0:
                count += 1
            mask_use += 1
            # '매우나쁨'인 경우 사용후 폐기
            if day[0] >= 151 and day[1] >= 76:
                mask_use = 0
            # '나쁨'인 경우
            elif mask_use >= 3:
                mask_use = 0
        else:
            # 날 좋은 경우 이미 사용중이면 사용량 + 1
            if mask_use > 0:
                mask_use += 1
                # 사용량이 3일이 넘으면 폐기
                if mask_use >= 3:
                    mask_use = 0

    return count