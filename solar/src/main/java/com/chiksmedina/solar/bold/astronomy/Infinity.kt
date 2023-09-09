package com.chiksmedina.solar.bold.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.AstronomyGroup

public val AstronomyGroup.Infinity: ImageVector
    get() {
        if (_infinity != null) {
            return _infinity!!
        }
        _infinity = Builder(name = "Infinity", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.0f, 7.75f)
                curveTo(4.6528f, 7.75f, 2.75f, 9.6528f, 2.75f, 12.0f)
                curveTo(2.75f, 14.3472f, 4.6528f, 16.25f, 7.0f, 16.25f)
                curveTo(7.5969f, 16.25f, 8.045f, 16.1427f, 8.4068f, 15.9664f)
                curveTo(8.7692f, 15.7898f, 9.086f, 15.524f, 9.393f, 15.1495f)
                curveTo(9.9331f, 14.4908f, 10.3762f, 13.5925f, 10.9602f, 12.409f)
                curveTo(11.0769f, 12.1724f, 11.1993f, 11.9244f, 11.3292f, 11.6646f)
                curveTo(11.4455f, 11.432f, 11.5589f, 11.2013f, 11.6707f, 10.9741f)
                curveTo(12.2514f, 9.7937f, 12.7873f, 8.7042f, 13.447f, 7.8995f)
                curveTo(13.8573f, 7.399f, 14.3366f, 6.9773f, 14.9362f, 6.6852f)
                curveTo(15.5364f, 6.3927f, 16.2162f, 6.25f, 17.0f, 6.25f)
                curveTo(20.1756f, 6.25f, 22.75f, 8.8244f, 22.75f, 12.0f)
                curveTo(22.75f, 15.1756f, 20.1756f, 17.75f, 17.0f, 17.75f)
                curveTo(15.7062f, 17.75f, 14.5105f, 17.3216f, 13.5495f, 16.5997f)
                curveTo(13.2184f, 16.3509f, 13.1516f, 15.8807f, 13.4003f, 15.5495f)
                curveTo(13.6491f, 15.2184f, 14.1193f, 15.1516f, 14.4505f, 15.4003f)
                curveTo(15.1608f, 15.934f, 16.0424f, 16.25f, 17.0f, 16.25f)
                curveTo(19.3472f, 16.25f, 21.25f, 14.3472f, 21.25f, 12.0f)
                curveTo(21.25f, 9.6528f, 19.3472f, 7.75f, 17.0f, 7.75f)
                curveTo(16.4031f, 7.75f, 15.955f, 7.8573f, 15.5932f, 8.0336f)
                curveTo(15.2308f, 8.2102f, 14.914f, 8.476f, 14.607f, 8.8505f)
                curveTo(14.0669f, 9.5092f, 13.6238f, 10.4075f, 13.0398f, 11.591f)
                curveTo(12.9231f, 11.8276f, 12.8007f, 12.0756f, 12.6708f, 12.3354f)
                curveTo(12.5545f, 12.568f, 12.4411f, 12.7987f, 12.3293f, 13.0259f)
                curveTo(11.7486f, 14.2063f, 11.2127f, 15.2959f, 10.553f, 16.1005f)
                curveTo(10.1427f, 16.601f, 9.6634f, 17.0227f, 9.0638f, 17.3148f)
                curveTo(8.4636f, 17.6073f, 7.7838f, 17.75f, 7.0f, 17.75f)
                curveTo(3.8244f, 17.75f, 1.25f, 15.1756f, 1.25f, 12.0f)
                curveTo(1.25f, 8.8244f, 3.8244f, 6.25f, 7.0f, 6.25f)
                curveTo(8.2938f, 6.25f, 9.4898f, 6.6782f, 10.451f, 7.4004f)
                curveTo(10.7822f, 7.6492f, 10.8489f, 8.1194f, 10.6001f, 8.4505f)
                curveTo(10.3513f, 8.7817f, 9.8811f, 8.8484f, 9.55f, 8.5996f)
                curveTo(8.8397f, 8.066f, 7.9578f, 7.75f, 7.0f, 7.75f)
                close()
            }
        }
        .build()
        return _infinity!!
    }

private var _infinity: ImageVector? = null
