package dev.chiksmedina.solar.boldduotone.arrowsaction

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
import dev.chiksmedina.solar.boldduotone.ArrowsActionGroup

val ArrowsActionGroup.ArrowToDownRight: ImageVector
    get() {
        if (_arrowToDownRight != null) {
            return _arrowToDownRight!!
        }
        _arrowToDownRight = Builder(
            name = "ArrowToDownRight", defaultWidth = 24.0.dp, defaultHeight
            = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(6.4697f, 13.9697f)
                curveTo(6.1768f, 14.2626f, 6.1768f, 14.7374f, 6.4697f, 15.0303f)
                lineTo(11.4697f, 20.0303f)
                curveTo(11.7626f, 20.3232f, 12.2374f, 20.3232f, 12.5303f, 20.0303f)
                lineTo(17.5303f, 15.0303f)
                curveTo(17.8232f, 14.7374f, 17.8232f, 14.2626f, 17.5303f, 13.9697f)
                curveTo(17.2374f, 13.6768f, 16.7626f, 13.6768f, 16.4697f, 13.9697f)
                lineTo(12.0f, 18.4393f)
                lineTo(7.5303f, 13.9697f)
                curveTo(7.2374f, 13.6768f, 6.7626f, 13.6768f, 6.4697f, 13.9697f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.25f, 9.5f)
                curveTo(11.25f, 8.5466f, 11.5298f, 7.1333f, 12.3913f, 5.9368f)
                curveTo(13.2804f, 4.702f, 14.7556f, 3.75f, 17.0f, 3.75f)
                curveTo(17.4142f, 3.75f, 17.75f, 4.0858f, 17.75f, 4.5f)
                curveTo(17.75f, 4.9142f, 17.4142f, 5.25f, 17.0f, 5.25f)
                curveTo(15.2444f, 5.25f, 14.2196f, 5.9647f, 13.6087f, 6.8132f)
                curveTo(12.9702f, 7.7f, 12.75f, 8.7867f, 12.75f, 9.5f)
                lineTo(12.75f, 17.6893f)
                lineTo(12.0f, 18.4393f)
                lineTo(11.25f, 17.6893f)
                verticalLineTo(9.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.8023f, 20.2236f)
                curveTo(11.9568f, 20.2656f, 12.122f, 20.2575f, 12.2722f, 20.199f)
                curveTo(12.1879f, 20.2319f, 12.096f, 20.25f, 12.0f, 20.25f)
                curveTo(11.9316f, 20.25f, 11.8653f, 20.2408f, 11.8023f, 20.2236f)
                close()
            }
        }
            .build()
        return _arrowToDownRight!!
    }

private var _arrowToDownRight: ImageVector? = null
