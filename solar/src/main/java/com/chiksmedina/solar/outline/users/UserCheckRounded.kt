package com.chiksmedina.solar.outline.users

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.UsersGroup

public val UsersGroup.UserCheckRounded: ImageVector
    get() {
        if (_userCheckRounded != null) {
            return _userCheckRounded!!
        }
        _userCheckRounded = Builder(name = "UserCheckRounded", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 1.25f)
                curveTo(9.3766f, 1.25f, 7.25f, 3.3767f, 7.25f, 6.0f)
                curveTo(7.25f, 8.6234f, 9.3766f, 10.75f, 12.0f, 10.75f)
                curveTo(14.6234f, 10.75f, 16.75f, 8.6234f, 16.75f, 6.0f)
                curveTo(16.75f, 3.3767f, 14.6234f, 1.25f, 12.0f, 1.25f)
                close()
                moveTo(8.75f, 6.0f)
                curveTo(8.75f, 4.2051f, 10.2051f, 2.75f, 12.0f, 2.75f)
                curveTo(13.7949f, 2.75f, 15.25f, 4.2051f, 15.25f, 6.0f)
                curveTo(15.25f, 7.7949f, 13.7949f, 9.25f, 12.0f, 9.25f)
                curveTo(10.2051f, 9.25f, 8.75f, 7.7949f, 8.75f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.8555f, 16.5729f)
                curveTo(19.1527f, 16.8614f, 19.1599f, 17.3362f, 18.8714f, 17.6334f)
                lineTo(17.0382f, 19.5223f)
                curveTo(16.8901f, 19.6749f, 16.6842f, 19.7575f, 16.4717f, 19.7495f)
                curveTo(16.2591f, 19.7414f, 16.06f, 19.6436f, 15.9239f, 19.4802f)
                lineTo(15.0904f, 18.4802f)
                curveTo(14.8252f, 18.162f, 14.8681f, 17.6891f, 15.1863f, 17.4239f)
                curveTo(15.5045f, 17.1587f, 15.9774f, 17.2016f, 16.2426f, 17.5198f)
                lineTo(16.5424f, 17.8794f)
                lineTo(17.795f, 16.5888f)
                curveTo(18.0834f, 16.2915f, 18.5583f, 16.2844f, 18.8555f, 16.5729f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.9107f, 21.6083f)
                curveTo(13.2991f, 21.7009f, 12.6587f, 21.75f, 12.0f, 21.75f)
                curveTo(9.9607f, 21.75f, 8.0775f, 21.2792f, 6.6782f, 20.4796f)
                curveTo(5.3f, 19.6921f, 4.25f, 18.4899f, 4.25f, 17.0f)
                curveTo(4.25f, 15.5101f, 5.3f, 14.3079f, 6.6782f, 13.5204f)
                curveTo(8.0775f, 12.7208f, 9.9607f, 12.25f, 12.0f, 12.25f)
                curveTo(13.8045f, 12.25f, 15.4825f, 12.6184f, 16.8117f, 13.2537f)
                curveTo(16.8742f, 13.2512f, 16.937f, 13.25f, 17.0f, 13.25f)
                curveTo(19.6234f, 13.25f, 21.75f, 15.3766f, 21.75f, 18.0f)
                curveTo(21.75f, 20.6234f, 19.6234f, 22.75f, 17.0f, 22.75f)
                curveTo(15.8204f, 22.75f, 14.7413f, 22.32f, 13.9107f, 21.6083f)
                close()
                moveTo(13.75f, 18.0f)
                curveTo(13.75f, 16.2051f, 15.2051f, 14.75f, 17.0f, 14.75f)
                curveTo(18.7949f, 14.75f, 20.25f, 16.2051f, 20.25f, 18.0f)
                curveTo(20.25f, 19.7949f, 18.7949f, 21.25f, 17.0f, 21.25f)
                curveTo(15.2051f, 21.25f, 13.75f, 19.7949f, 13.75f, 18.0f)
                close()
                moveTo(14.4176f, 14.0127f)
                curveTo(13.113f, 14.8593f, 12.25f, 16.3289f, 12.25f, 18.0f)
                curveTo(12.25f, 18.8029f, 12.4492f, 19.5593f, 12.8009f, 20.2224f)
                curveTo(12.5388f, 20.2406f, 12.2715f, 20.25f, 12.0f, 20.25f)
                curveTo(10.1733f, 20.25f, 8.5565f, 19.8253f, 7.4224f, 19.1772f)
                curveTo(6.267f, 18.517f, 5.75f, 17.7193f, 5.75f, 17.0f)
                curveTo(5.75f, 16.2807f, 6.267f, 15.483f, 7.4224f, 14.8228f)
                curveTo(8.5565f, 14.1747f, 10.1733f, 13.75f, 12.0f, 13.75f)
                curveTo(12.8611f, 13.75f, 13.6767f, 13.8444f, 14.4176f, 14.0127f)
                close()
            }
        }
        .build()
        return _userCheckRounded!!
    }

private var _userCheckRounded: ImageVector? = null
