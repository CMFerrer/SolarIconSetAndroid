package com.chiksmedina.solar.bold.school

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
import com.chiksmedina.solar.bold.SchoolGroup

val SchoolGroup.PassportMinimalistic: ImageVector
    get() {
        if (_passportMinimalistic != null) {
            return _passportMinimalistic!!
        }
        _passportMinimalistic = Builder(
            name = "PassportMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.0f, 5.0f)
                curveTo(5.0f, 4.5933f, 4.7573f, 4.2434f, 4.4088f, 4.0871f)
                curveTo(4.5527f, 3.9737f, 4.7271f, 3.8962f, 4.9196f, 3.8686f)
                lineTo(15.7172f, 2.3261f)
                curveTo(16.922f, 2.154f, 18.0f, 3.0889f, 18.0f, 4.306f)
                verticalLineTo(5.126f)
                curveTo(17.6804f, 5.0437f, 17.3453f, 5.0f, 17.0f, 5.0f)
                horizontalLineTo(5.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.75f, 14.0f)
                curveTo(9.75f, 12.7574f, 10.7574f, 11.75f, 12.0f, 11.75f)
                curveTo(13.2426f, 11.75f, 14.25f, 12.7574f, 14.25f, 14.0f)
                curveTo(14.25f, 15.2426f, 13.2426f, 16.25f, 12.0f, 16.25f)
                curveTo(10.7574f, 16.25f, 9.75f, 15.2426f, 9.75f, 14.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(18.0f, 6.1707f)
                curveTo(19.1652f, 6.5825f, 20.0f, 7.6938f, 20.0f, 9.0f)
                verticalLineTo(19.0f)
                curveTo(20.0f, 20.6569f, 18.6569f, 22.0f, 17.0f, 22.0f)
                horizontalLineTo(7.0f)
                curveTo(5.3432f, 22.0f, 4.0f, 20.6569f, 4.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(4.0f, 5.1821f, 4.0487f, 5.3529f, 4.1338f, 5.5f)
                curveTo(4.3067f, 5.7989f, 4.6299f, 6.0f, 5.0f, 6.0f)
                horizontalLineTo(17.0f)
                curveTo(17.3506f, 6.0f, 17.6872f, 6.0602f, 18.0f, 6.1707f)
                close()
                moveTo(12.0f, 10.25f)
                curveTo(9.9289f, 10.25f, 8.25f, 11.9289f, 8.25f, 14.0f)
                curveTo(8.25f, 16.0711f, 9.9289f, 17.75f, 12.0f, 17.75f)
                curveTo(14.0711f, 17.75f, 15.75f, 16.0711f, 15.75f, 14.0f)
                curveTo(15.75f, 11.9289f, 14.0711f, 10.25f, 12.0f, 10.25f)
                close()
            }
        }
            .build()
        return _passportMinimalistic!!
    }

private var _passportMinimalistic: ImageVector? = null
