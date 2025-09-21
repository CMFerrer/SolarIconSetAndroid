package dev.chiksmedina.solar.bold.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.EssentionalUiGroup

val EssentionalUiGroup.Mirror: ImageVector
    get() {
        if (_mirror != null) {
            return _mirror!!
        }
        _mirror = Builder(
            name = "Mirror", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
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
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(3.0f, 12.0f)
                curveTo(3.0f, 7.0294f, 7.0294f, 3.0f, 12.0f, 3.0f)
                curveTo(16.9706f, 3.0f, 21.0f, 7.0294f, 21.0f, 12.0f)
                curveTo(21.0f, 13.2414f, 20.7487f, 14.4241f, 20.2941f, 15.5f)
                horizontalLineTo(16.8284f)
                curveTo(15.9002f, 15.5f, 15.0099f, 15.8687f, 14.3536f, 16.5251f)
                lineTo(13.5251f, 17.3536f)
                curveTo(13.4314f, 17.4473f, 13.3042f, 17.5f, 13.1716f, 17.5f)
                horizontalLineTo(10.8284f)
                curveTo(10.6958f, 17.5f, 10.5686f, 17.4473f, 10.4749f, 17.3536f)
                lineTo(9.6465f, 16.5251f)
                curveTo(8.9901f, 15.8687f, 8.0998f, 15.5f, 7.1716f, 15.5f)
                horizontalLineTo(3.7059f)
                curveTo(3.2513f, 14.4241f, 3.0f, 13.2414f, 3.0f, 12.0f)
                close()
            }
        }
            .build()
        return _mirror!!
    }

private var _mirror: ImageVector? = null
