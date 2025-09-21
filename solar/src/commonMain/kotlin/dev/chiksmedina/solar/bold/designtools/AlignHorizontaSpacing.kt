package dev.chiksmedina.solar.bold.designtools

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
import dev.chiksmedina.solar.bold.DesignToolsGroup

val DesignToolsGroup.AlignHorizontaSpacing: ImageVector
    get() {
        if (_alignHorizontaSpacing != null) {
            return _alignHorizontaSpacing!!
        }
        _alignHorizontaSpacing = Builder(
            name = "AlignHorizontaSpacing", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(3.0f, 1.25f)
                curveTo(3.4142f, 1.25f, 3.75f, 1.5858f, 3.75f, 2.0f)
                lineTo(3.75f, 22.0f)
                curveTo(3.75f, 22.4142f, 3.4142f, 22.75f, 3.0f, 22.75f)
                curveTo(2.5858f, 22.75f, 2.25f, 22.4142f, 2.25f, 22.0f)
                lineTo(2.25f, 2.0f)
                curveTo(2.25f, 1.5858f, 2.5858f, 1.25f, 3.0f, 1.25f)
                close()
                moveTo(21.0f, 1.25f)
                curveTo(21.4142f, 1.25f, 21.75f, 1.5858f, 21.75f, 2.0f)
                lineTo(21.75f, 22.0f)
                curveTo(21.75f, 22.4142f, 21.4142f, 22.75f, 21.0f, 22.75f)
                curveTo(20.5858f, 22.75f, 20.25f, 22.4142f, 20.25f, 22.0f)
                lineTo(20.25f, 2.0f)
                curveTo(20.25f, 1.5858f, 20.5858f, 1.25f, 21.0f, 1.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 4.0f)
                curveTo(10.1144f, 4.0f, 9.1716f, 4.0f, 8.5858f, 4.5858f)
                curveTo(8.0f, 5.1716f, 8.0f, 6.1144f, 8.0f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(8.0f, 17.8856f, 8.0f, 18.8284f, 8.5858f, 19.4142f)
                curveTo(9.1716f, 20.0f, 10.1144f, 20.0f, 12.0f, 20.0f)
                curveTo(13.8856f, 20.0f, 14.8284f, 20.0f, 15.4142f, 19.4142f)
                curveTo(16.0f, 18.8284f, 16.0f, 17.8856f, 16.0f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(16.0f, 6.1144f, 16.0f, 5.1716f, 15.4142f, 4.5858f)
                curveTo(14.8284f, 4.0f, 13.8856f, 4.0f, 12.0f, 4.0f)
                close()
            }
        }
            .build()
        return _alignHorizontaSpacing!!
    }

private var _alignHorizontaSpacing: ImageVector? = null
