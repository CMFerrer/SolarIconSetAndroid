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

public val UsersGroup.UserCrossRounded: ImageVector
    get() {
        if (_userCrossRounded != null) {
            return _userCrossRounded!!
        }
        _userCrossRounded = Builder(name = "UserCrossRounded", defaultWidth = 24.0.dp, defaultHeight
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
                moveTo(16.1968f, 16.1363f)
                curveTo(15.9039f, 15.8434f, 15.4291f, 15.8434f, 15.1362f, 16.1363f)
                curveTo(14.8433f, 16.4292f, 14.8433f, 16.9041f, 15.1362f, 17.197f)
                lineTo(15.9393f, 18.0002f)
                lineTo(15.1365f, 18.803f)
                curveTo(14.8436f, 19.0959f, 14.8436f, 19.5708f, 15.1365f, 19.8637f)
                curveTo(15.4294f, 20.1565f, 15.9043f, 20.1565f, 16.1972f, 19.8637f)
                lineTo(17.0f, 19.0608f)
                lineTo(17.8028f, 19.8637f)
                curveTo(18.0957f, 20.1565f, 18.5706f, 20.1565f, 18.8635f, 19.8637f)
                curveTo(19.1564f, 19.5708f, 19.1564f, 19.0959f, 18.8635f, 18.803f)
                lineTo(18.0607f, 18.0002f)
                lineTo(18.8638f, 17.197f)
                curveTo(19.1567f, 16.9041f, 19.1567f, 16.4292f, 18.8638f, 16.1363f)
                curveTo(18.5709f, 15.8434f, 18.0961f, 15.8434f, 17.8032f, 16.1363f)
                lineTo(17.0f, 16.9395f)
                lineTo(16.1968f, 16.1363f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 12.25f)
                curveTo(13.8045f, 12.25f, 15.4825f, 12.6184f, 16.8118f, 13.2537f)
                curveTo(16.8742f, 13.2512f, 16.937f, 13.25f, 17.0f, 13.25f)
                curveTo(19.6234f, 13.25f, 21.75f, 15.3766f, 21.75f, 18.0f)
                curveTo(21.75f, 20.6234f, 19.6234f, 22.75f, 17.0f, 22.75f)
                curveTo(15.8204f, 22.75f, 14.7413f, 22.32f, 13.9107f, 21.6083f)
                curveTo(13.2991f, 21.7009f, 12.6587f, 21.75f, 12.0f, 21.75f)
                curveTo(9.9607f, 21.75f, 8.0775f, 21.2792f, 6.6782f, 20.4796f)
                curveTo(5.3f, 19.6921f, 4.25f, 18.4899f, 4.25f, 17.0f)
                curveTo(4.25f, 15.5101f, 5.3f, 14.3079f, 6.6782f, 13.5204f)
                curveTo(8.0775f, 12.7208f, 9.9607f, 12.25f, 12.0f, 12.25f)
                close()
                moveTo(5.75f, 17.0f)
                curveTo(5.75f, 16.2807f, 6.267f, 15.483f, 7.4224f, 14.8228f)
                curveTo(8.5565f, 14.1747f, 10.1733f, 13.75f, 12.0f, 13.75f)
                curveTo(12.8611f, 13.75f, 13.6767f, 13.8444f, 14.4176f, 14.0127f)
                curveTo(13.113f, 14.8593f, 12.25f, 16.3289f, 12.25f, 18.0f)
                curveTo(12.25f, 18.8029f, 12.4492f, 19.5593f, 12.8009f, 20.2224f)
                curveTo(12.5388f, 20.2406f, 12.2715f, 20.25f, 12.0f, 20.25f)
                curveTo(10.1733f, 20.25f, 8.5565f, 19.8253f, 7.4224f, 19.1772f)
                curveTo(6.267f, 18.517f, 5.75f, 17.7193f, 5.75f, 17.0f)
                close()
                moveTo(17.0f, 14.75f)
                curveTo(15.2051f, 14.75f, 13.75f, 16.2051f, 13.75f, 18.0f)
                curveTo(13.75f, 19.7949f, 15.2051f, 21.25f, 17.0f, 21.25f)
                curveTo(18.7949f, 21.25f, 20.25f, 19.7949f, 20.25f, 18.0f)
                curveTo(20.25f, 16.2051f, 18.7949f, 14.75f, 17.0f, 14.75f)
                close()
            }
        }
        .build()
        return _userCrossRounded!!
    }

private var _userCrossRounded: ImageVector? = null
