package com.chiksmedina.solar.boldduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.chiksmedina.solar.boldduotone.EssentionalUiGroup

public val EssentionalUiGroup.Mirror: ImageVector
    get() {
        if (_mirror != null) {
            return _mirror!!
        }
        _mirror = Builder(name = "Mirror", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.6364f, 22.0f)
                horizontalLineTo(18.3636f)
                curveTo(20.3719f, 22.0f, 22.0f, 20.3719f, 22.0f, 18.3636f)
                curveTo(22.0f, 17.6105f, 21.3895f, 17.0f, 20.6364f, 17.0f)
                horizontalLineTo(16.8284f)
                curveTo(16.298f, 17.0f, 15.7893f, 17.2107f, 15.4142f, 17.5858f)
                lineTo(14.5858f, 18.4142f)
                curveTo(14.2107f, 18.7893f, 13.702f, 19.0f, 13.1716f, 19.0f)
                horizontalLineTo(10.8284f)
                curveTo(10.298f, 19.0f, 9.7893f, 18.7893f, 9.4142f, 18.4142f)
                lineTo(8.5858f, 17.5858f)
                curveTo(8.2107f, 17.2107f, 7.702f, 17.0f, 7.1716f, 17.0f)
                horizontalLineTo(3.3636f)
                curveTo(2.6105f, 17.0f, 2.0f, 17.6105f, 2.0f, 18.3636f)
                curveTo(2.0f, 20.3719f, 3.6281f, 22.0f, 5.6364f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.4845f, 17.0f)
                curveTo(20.4417f, 15.5699f, 21.0f, 13.8501f, 21.0f, 12.0f)
                curveTo(21.0f, 7.0294f, 16.9706f, 3.0f, 12.0f, 3.0f)
                curveTo(7.0294f, 3.0f, 3.0f, 7.0294f, 3.0f, 12.0f)
                curveTo(3.0f, 13.8501f, 3.5583f, 15.5699f, 4.5156f, 17.0f)
                horizontalLineTo(7.1716f)
                curveTo(7.702f, 17.0f, 8.2107f, 17.2107f, 8.5858f, 17.5858f)
                lineTo(9.4142f, 18.4142f)
                curveTo(9.7893f, 18.7893f, 10.298f, 19.0f, 10.8284f, 19.0f)
                horizontalLineTo(13.1716f)
                curveTo(13.702f, 19.0f, 14.2107f, 18.7893f, 14.5858f, 18.4142f)
                lineTo(15.4142f, 17.5858f)
                curveTo(15.7893f, 17.2107f, 16.298f, 17.0f, 16.8284f, 17.0f)
                horizontalLineTo(19.4845f)
                close()
            }
        }
        .build()
        return _mirror!!
    }

private var _mirror: ImageVector? = null
