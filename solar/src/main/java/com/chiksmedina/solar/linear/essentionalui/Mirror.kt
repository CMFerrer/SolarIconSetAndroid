package com.chiksmedina.solar.linear.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.EssentionalUiGroup

public val EssentionalUiGroup.Mirror: ImageVector
    get() {
        if (_mirror != null) {
            return _mirror!!
        }
        _mirror = Builder(name = "Mirror", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.35f, 17.0f)
                curveTo(3.4942f, 15.597f, 3.0f, 13.9413f, 3.0f, 12.168f)
                curveTo(3.0f, 7.1047f, 7.0294f, 3.0f, 12.0f, 3.0f)
                curveTo(16.9706f, 3.0f, 21.0f, 7.1047f, 21.0f, 12.168f)
                curveTo(21.0f, 13.9413f, 20.5058f, 15.597f, 19.65f, 17.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
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
        }
        .build()
        return _mirror!!
    }

private var _mirror: ImageVector? = null
