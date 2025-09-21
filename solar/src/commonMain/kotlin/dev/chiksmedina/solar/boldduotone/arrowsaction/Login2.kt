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

val ArrowsActionGroup.Login2: ImageVector
    get() {
        if (_login2 != null) {
            return _login2!!
        }
        _login2 = Builder(
            name = "Login2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.9998f, 2.0f)
                lineTo(14.9998f, 2.0f)
                curveTo(12.1714f, 2.0f, 10.7576f, 2.0002f, 9.8789f, 2.8789f)
                curveTo(9.0002f, 3.7576f, 9.0002f, 5.1718f, 9.0002f, 8.0002f)
                lineTo(9.0002f, 16.0002f)
                curveTo(9.0002f, 18.8287f, 9.0002f, 20.2429f, 9.8789f, 21.1215f)
                curveTo(10.7574f, 22.0f, 12.1706f, 22.0f, 14.9976f, 22.0f)
                lineTo(14.9998f, 22.0f)
                lineTo(15.9998f, 22.0f)
                curveTo(18.8282f, 22.0f, 20.2424f, 22.0f, 21.1211f, 21.1213f)
                curveTo(21.9998f, 20.2426f, 21.9998f, 18.8284f, 21.9998f, 16.0f)
                lineTo(21.9998f, 8.0f)
                lineTo(21.9998f, 8.0f)
                curveTo(21.9998f, 5.1716f, 21.9998f, 3.7574f, 21.1211f, 2.8787f)
                curveTo(20.2424f, 2.0f, 18.8282f, 2.0f, 15.9998f, 2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(1.251f, 11.999f)
                curveTo(1.251f, 11.5848f, 1.5868f, 11.249f, 2.001f, 11.249f)
                lineTo(13.9735f, 11.249f)
                lineTo(12.0129f, 9.5684f)
                curveTo(11.6984f, 9.2989f, 11.662f, 8.8254f, 11.9315f, 8.5109f)
                curveTo(12.2011f, 8.1964f, 12.6746f, 8.16f, 12.9891f, 8.4296f)
                lineTo(16.4891f, 11.4296f)
                curveTo(16.6553f, 11.5721f, 16.751f, 11.7801f, 16.751f, 11.999f)
                curveTo(16.751f, 12.218f, 16.6553f, 12.426f, 16.4891f, 12.5685f)
                lineTo(12.9891f, 15.5685f)
                curveTo(12.6746f, 15.838f, 12.2011f, 15.8016f, 11.9315f, 15.4871f)
                curveTo(11.662f, 15.1726f, 11.6984f, 14.6991f, 12.0129f, 14.4296f)
                lineTo(13.9735f, 12.749f)
                lineTo(2.001f, 12.749f)
                curveTo(1.5868f, 12.749f, 1.251f, 12.4132f, 1.251f, 11.999f)
                close()
            }
        }
            .build()
        return _login2!!
    }

private var _login2: ImageVector? = null
