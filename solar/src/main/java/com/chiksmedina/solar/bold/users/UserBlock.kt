package com.chiksmedina.solar.bold.users

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.UsersGroup

val UsersGroup.UserBlock: ImageVector
    get() {
        if (_userBlock != null) {
            return _userBlock!!
        }
        _userBlock = Builder(
            name = "UserBlock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(16.5f, 15.75f)
                curveTo(14.9812f, 15.75f, 13.75f, 16.9812f, 13.75f, 18.5f)
                curveTo(13.75f, 19.0004f, 13.8832f, 19.4691f, 14.1167f, 19.8732f)
                lineTo(17.8732f, 16.1167f)
                curveTo(17.4691f, 15.8832f, 17.0004f, 15.75f, 16.5f, 15.75f)
                close()
                moveTo(18.9196f, 17.1916f)
                lineTo(15.1916f, 20.9196f)
                curveTo(15.5806f, 21.1305f, 16.0261f, 21.25f, 16.5f, 21.25f)
                curveTo(18.0188f, 21.25f, 19.25f, 20.0188f, 19.25f, 18.5f)
                curveTo(19.25f, 18.0261f, 19.1305f, 17.5806f, 18.9196f, 17.1916f)
                close()
                moveTo(12.25f, 18.5f)
                curveTo(12.25f, 16.1528f, 14.1528f, 14.25f, 16.5f, 14.25f)
                curveTo(17.689f, 14.25f, 18.7652f, 14.7393f, 19.5357f, 15.5256f)
                curveTo(20.2861f, 16.2914f, 20.75f, 17.3423f, 20.75f, 18.5f)
                curveTo(20.75f, 20.8472f, 18.8472f, 22.75f, 16.5f, 22.75f)
                curveTo(15.3423f, 22.75f, 14.2914f, 22.2861f, 13.5256f, 21.5357f)
                curveTo(12.7393f, 20.7652f, 12.25f, 19.689f, 12.25f, 18.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.0f, 6.0f)
                curveTo(16.0f, 8.2091f, 14.2091f, 10.0f, 12.0f, 10.0f)
                curveTo(9.7909f, 10.0f, 8.0f, 8.2091f, 8.0f, 6.0f)
                curveTo(8.0f, 3.7909f, 9.7909f, 2.0f, 12.0f, 2.0f)
                curveTo(14.2091f, 2.0f, 16.0f, 3.7909f, 16.0f, 6.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.2951f, 13.1879f)
                curveTo(12.2137f, 14.0529f, 10.75f, 16.1055f, 10.75f, 18.5f)
                curveTo(10.75f, 19.8163f, 11.1943f, 21.0315f, 11.9378f, 22.0f)
                curveTo(4.0f, 21.9895f, 4.0f, 19.9788f, 4.0f, 17.5f)
                curveTo(4.0f, 15.0147f, 7.5817f, 13.0f, 12.0f, 13.0f)
                curveTo(12.7977f, 13.0f, 13.5681f, 13.0657f, 14.2951f, 13.1879f)
                close()
            }
        }
            .build()
        return _userBlock!!
    }

private var _userBlock: ImageVector? = null
