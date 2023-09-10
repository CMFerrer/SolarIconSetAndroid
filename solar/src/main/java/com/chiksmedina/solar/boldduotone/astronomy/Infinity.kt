package com.chiksmedina.solar.boldduotone.astronomy

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
import com.chiksmedina.solar.boldduotone.AstronomyGroup

val AstronomyGroup.Infinity: ImageVector
    get() {
        if (_infinity != null) {
            return _infinity!!
        }
        _infinity = Builder(
            name = "Infinity", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(2.75f, 12.0f)
                curveTo(2.75f, 9.6528f, 4.6528f, 7.75f, 7.0f, 7.75f)
                curveTo(7.9578f, 7.75f, 8.8397f, 8.066f, 9.55f, 8.5996f)
                curveTo(9.8811f, 8.8484f, 10.3513f, 8.7817f, 10.6001f, 8.4505f)
                curveTo(10.8489f, 8.1194f, 10.7822f, 7.6492f, 10.451f, 7.4004f)
                curveTo(9.4898f, 6.6782f, 8.2938f, 6.25f, 7.0f, 6.25f)
                curveTo(3.8244f, 6.25f, 1.25f, 8.8244f, 1.25f, 12.0f)
                curveTo(1.25f, 15.1756f, 3.8244f, 17.75f, 7.0f, 17.75f)
                curveTo(7.7838f, 17.75f, 8.4636f, 17.6073f, 9.0638f, 17.3148f)
                curveTo(9.6634f, 17.0227f, 10.1427f, 16.601f, 10.553f, 16.1005f)
                curveTo(11.2127f, 15.2959f, 11.7486f, 14.2063f, 12.3293f, 13.0259f)
                curveTo(12.3858f, 12.9109f, 12.5271f, 12.6233f, 12.668f, 12.3371f)
                curveTo(12.8508f, 11.9654f, 12.6997f, 11.5144f, 12.3292f, 11.3292f)
                curveTo(11.9587f, 11.1439f, 11.5091f, 11.2945f, 11.326f, 11.6661f)
                curveTo(11.1751f, 11.9724f, 11.0215f, 12.2847f, 10.9602f, 12.409f)
                curveTo(10.3762f, 13.5925f, 9.9331f, 14.4908f, 9.393f, 15.1495f)
                curveTo(9.086f, 15.524f, 8.7692f, 15.7898f, 8.4068f, 15.9664f)
                curveTo(8.045f, 16.1427f, 7.5969f, 16.25f, 7.0f, 16.25f)
                curveTo(4.6528f, 16.25f, 2.75f, 14.3472f, 2.75f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.6691f, 12.3346f)
                curveTo(12.8501f, 11.9634f, 12.6988f, 11.514f, 12.3292f, 11.3292f)
                curveTo(11.977f, 11.1531f, 11.5532f, 11.2805f, 11.355f, 11.6127f)
                curveTo(11.4623f, 11.3977f, 11.5672f, 11.1844f, 11.6706f, 10.9741f)
                curveTo(12.2513f, 9.7937f, 12.7872f, 8.7042f, 13.4469f, 7.8995f)
                curveTo(13.8572f, 7.399f, 14.3365f, 6.9773f, 14.9361f, 6.6852f)
                curveTo(15.5363f, 6.3927f, 16.2161f, 6.25f, 16.9999f, 6.25f)
                curveTo(20.1755f, 6.25f, 22.7499f, 8.8244f, 22.7499f, 12.0f)
                curveTo(22.7499f, 15.1756f, 20.1755f, 17.75f, 16.9999f, 17.75f)
                curveTo(15.7061f, 17.75f, 14.5104f, 17.3216f, 13.5494f, 16.5997f)
                curveTo(13.2183f, 16.3509f, 13.1515f, 15.8807f, 13.4002f, 15.5495f)
                curveTo(13.649f, 15.2184f, 14.1192f, 15.1516f, 14.4504f, 15.4003f)
                curveTo(15.1607f, 15.934f, 16.0423f, 16.25f, 16.9999f, 16.25f)
                curveTo(19.3471f, 16.25f, 21.2499f, 14.3472f, 21.2499f, 12.0f)
                curveTo(21.2499f, 9.6528f, 19.3471f, 7.75f, 16.9999f, 7.75f)
                curveTo(16.403f, 7.75f, 15.9549f, 7.8573f, 15.5931f, 8.0336f)
                curveTo(15.2307f, 8.2102f, 14.9139f, 8.476f, 14.6069f, 8.8505f)
                curveTo(14.0668f, 9.5092f, 13.6237f, 10.4075f, 13.0397f, 11.591f)
                curveTo(12.923f, 11.8276f, 12.8006f, 12.0757f, 12.6707f, 12.3354f)
                lineTo(12.6691f, 12.3346f)
                close()
            }
        }
            .build()
        return _infinity!!
    }

private var _infinity: ImageVector? = null
