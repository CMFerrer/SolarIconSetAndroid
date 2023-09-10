package com.chiksmedina.solar.lineduotone.school

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.SchoolGroup

val SchoolGroup.BookMinimalistic: ImageVector
    get() {
        if (_bookMinimalistic != null) {
            return _bookMinimalistic!!
        }
        _bookMinimalistic = Builder(
            name = "BookMinimalistic", defaultWidth = 24.0.dp, defaultHeight
            = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.0f, 8.0f)
                curveTo(4.0f, 5.1716f, 4.0f, 3.7574f, 4.8787f, 2.8787f)
                curveTo(5.7574f, 2.0f, 7.1716f, 2.0f, 10.0f, 2.0f)
                horizontalLineTo(14.0f)
                curveTo(16.8284f, 2.0f, 18.2426f, 2.0f, 19.1213f, 2.8787f)
                curveTo(20.0f, 3.7574f, 20.0f, 5.1716f, 20.0f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(20.0f, 18.8284f, 20.0f, 20.2426f, 19.1213f, 21.1213f)
                curveTo(18.2426f, 22.0f, 16.8284f, 22.0f, 14.0f, 22.0f)
                horizontalLineTo(10.0f)
                curveTo(7.1716f, 22.0f, 5.7574f, 22.0f, 4.8787f, 21.1213f)
                curveTo(4.0f, 20.2426f, 4.0f, 18.8284f, 4.0f, 16.0f)
                verticalLineTo(8.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.1213f, 16.1022f)
                lineTo(5.9272f, 15.3778f)
                lineTo(5.9272f, 15.3778f)
                lineTo(6.1213f, 16.1022f)
                close()
                moveTo(3.2756f, 18.0294f)
                curveTo(3.1683f, 18.4295f, 3.4058f, 18.8408f, 3.8059f, 18.948f)
                curveTo(4.206f, 19.0552f, 4.6172f, 18.8178f, 4.7244f, 18.4177f)
                lineTo(3.2756f, 18.0294f)
                close()
                moveTo(6.25f, 16.0f)
                curveTo(6.25f, 16.4142f, 6.5858f, 16.75f, 7.0f, 16.75f)
                curveTo(7.4142f, 16.75f, 7.75f, 16.4142f, 7.75f, 16.0f)
                horizontalLineTo(6.25f)
                close()
                moveTo(7.75f, 2.5f)
                curveTo(7.75f, 2.0858f, 7.4142f, 1.75f, 7.0f, 1.75f)
                curveTo(6.5858f, 1.75f, 6.25f, 2.0858f, 6.25f, 2.5f)
                horizontalLineTo(7.75f)
                close()
                moveTo(7.8978f, 16.75f)
                horizontalLineTo(19.8978f)
                verticalLineTo(15.25f)
                horizontalLineTo(7.8978f)
                verticalLineTo(16.75f)
                close()
                moveTo(7.8978f, 15.25f)
                curveTo(7.0161f, 15.25f, 6.4281f, 15.2436f, 5.9272f, 15.3778f)
                lineTo(6.3154f, 16.8267f)
                curveTo(6.5775f, 16.7564f, 6.9195f, 16.75f, 7.8978f, 16.75f)
                verticalLineTo(15.25f)
                close()
                moveTo(5.9272f, 15.3778f)
                curveTo(4.6331f, 15.7245f, 3.6223f, 16.7353f, 3.2756f, 18.0294f)
                lineTo(4.7244f, 18.4177f)
                curveTo(4.9325f, 17.6412f, 5.539f, 17.0347f, 6.3154f, 16.8267f)
                lineTo(5.9272f, 15.3778f)
                close()
                moveTo(7.75f, 16.0f)
                verticalLineTo(2.5f)
                horizontalLineTo(6.25f)
                verticalLineTo(16.0f)
                horizontalLineTo(7.75f)
                close()
            }
        }
            .build()
        return _bookMinimalistic!!
    }

private var _bookMinimalistic: ImageVector? = null
