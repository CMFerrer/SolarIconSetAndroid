package com.chiksmedina.solar.boldduotone.arrowsaction

import androidx.compose.ui.graphics.Color
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
import com.chiksmedina.solar.boldduotone.ArrowsActionGroup

public val ArrowsActionGroup.Scale: ImageVector
    get() {
        if (_scale != null) {
            return _scale!!
        }
        _scale = Builder(name = "Scale", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.6562f, 2.75f)
                curveTo(16.242f, 2.75f, 15.9062f, 2.4142f, 15.9062f, 2.0f)
                curveTo(15.9062f, 1.5858f, 16.242f, 1.25f, 16.6562f, 1.25f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 1.25f, 22.75f, 1.5858f, 22.75f, 2.0f)
                verticalLineTo(7.3438f)
                curveTo(22.75f, 7.758f, 22.4142f, 8.0938f, 22.0f, 8.0938f)
                curveTo(21.5858f, 8.0938f, 21.25f, 7.758f, 21.25f, 7.3438f)
                verticalLineTo(3.8107f)
                lineTo(13.8107f, 11.25f)
                horizontalLineTo(16.0f)
                curveTo(16.4142f, 11.25f, 16.75f, 11.5858f, 16.75f, 12.0f)
                curveTo(16.75f, 12.4142f, 16.4142f, 12.75f, 16.0f, 12.75f)
                horizontalLineTo(12.0f)
                curveTo(11.5858f, 12.75f, 11.25f, 12.4142f, 11.25f, 12.0f)
                verticalLineTo(8.0f)
                curveTo(11.25f, 7.5858f, 11.5858f, 7.25f, 12.0f, 7.25f)
                curveTo(12.4142f, 7.25f, 12.75f, 7.5858f, 12.75f, 8.0f)
                verticalLineTo(10.1893f)
                lineTo(20.1893f, 2.75f)
                horizontalLineTo(16.6562f)
                close()
            }
        }
        .build()
        return _scale!!
    }

private var _scale: ImageVector? = null
