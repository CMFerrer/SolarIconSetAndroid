package com.chiksmedina.solar.boldduotone.security

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
import com.chiksmedina.solar.boldduotone.SecurityGroup

val SecurityGroup.EyeClosed: ImageVector
    get() {
        if (_eyeClosed != null) {
            return _eyeClosed!!
        }
        _eyeClosed = Builder(
            name = "EyeClosed", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(2.9186f, 6.6049f)
                curveTo(2.7006f, 6.0981f, 2.1133f, 5.8635f, 1.606f, 6.0809f)
                curveTo(1.0984f, 6.2984f, 0.8636f, 6.8871f, 1.0812f, 7.3948f)
                lineTo(1.0816f, 7.3958f)
                lineTo(1.0827f, 7.3982f)
                lineTo(1.0857f, 7.4051f)
                lineTo(1.095f, 7.4264f)
                curveTo(1.1028f, 7.4439f, 1.1136f, 7.4679f, 1.1275f, 7.4979f)
                curveTo(1.1553f, 7.5581f, 1.1954f, 7.6426f, 1.2481f, 7.748f)
                curveTo(1.3534f, 7.9587f, 1.5096f, 8.2538f, 1.7188f, 8.6052f)
                curveTo(2.1277f, 9.2922f, 2.7453f, 10.2045f, 3.5903f, 11.1243f)
                lineTo(2.7929f, 11.9217f)
                curveTo(2.4023f, 12.3123f, 2.4023f, 12.9454f, 2.7929f, 13.3359f)
                curveTo(3.1834f, 13.7265f, 3.8165f, 13.7265f, 4.2071f, 13.3359f)
                lineTo(5.0475f, 12.4955f)
                curveTo(5.6125f, 12.9518f, 6.2441f, 13.3816f, 6.9442f, 13.7522f)
                lineTo(6.1618f, 14.9546f)
                curveTo(5.8606f, 15.4175f, 5.9917f, 16.037f, 6.4546f, 16.3382f)
                curveTo(6.9175f, 16.6394f, 7.5369f, 16.5083f, 7.8381f, 16.0454f)
                lineTo(8.8233f, 14.5313f)
                curveTo(9.5001f, 14.7388f, 10.2253f, 14.8866f, 11.0f, 14.9558f)
                verticalLineTo(16.5f)
                curveTo(11.0f, 17.0523f, 11.4477f, 17.5f, 12.0f, 17.5f)
                verticalLineTo(13.0f)
                curveTo(9.2523f, 13.0f, 7.181f, 11.8014f, 5.6963f, 10.4112f)
                curveTo(5.6882f, 10.4033f, 5.68f, 10.3956f, 5.6717f, 10.3881f)
                curveTo(5.4732f, 10.2011f, 5.2853f, 10.0108f, 5.1077f, 9.8195f)
                curveTo(4.3544f, 9.0082f, 3.8014f, 8.1938f, 3.4374f, 7.5823f)
                curveTo(3.2559f, 7.2775f, 3.123f, 7.0257f, 3.037f, 6.8536f)
                curveTo(2.994f, 6.7676f, 2.9628f, 6.7017f, 2.9432f, 6.6593f)
                curveTo(2.9334f, 6.6381f, 2.9265f, 6.6228f, 2.9225f, 6.6137f)
                lineTo(2.9186f, 6.6049f)
                close()
                moveTo(1.0812f, 7.3948f)
                lineTo(2.0f, 7.0f)
                curveTo(1.0808f, 7.3939f, 1.0812f, 7.3948f, 1.0812f, 7.3948f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.2209f, 12.3981f)
                curveTo(14.2784f, 12.7691f, 13.209f, 12.9999f, 12.0f, 12.9999f)
                verticalLineTo(17.4999f)
                curveTo(12.5523f, 17.4999f, 13.0f, 17.0522f, 13.0f, 16.4999f)
                verticalLineTo(14.9556f)
                curveTo(13.772f, 14.8865f, 14.4974f, 14.739f, 15.1764f, 14.5308f)
                lineTo(16.1618f, 16.0453f)
                curveTo(16.463f, 16.5083f, 17.0825f, 16.6393f, 17.5454f, 16.3381f)
                curveTo(18.0083f, 16.0369f, 18.1394f, 15.4175f, 17.8382f, 14.9546f)
                lineTo(17.0558f, 13.7521f)
                curveTo(17.757f, 13.3813f, 18.3885f, 12.9515f, 18.9527f, 12.4957f)
                lineTo(19.7929f, 13.3359f)
                curveTo(20.1834f, 13.7264f, 20.8166f, 13.7264f, 21.2071f, 13.3359f)
                curveTo(21.5976f, 12.9454f, 21.5976f, 12.3122f, 21.2071f, 11.9217f)
                lineTo(20.4097f, 11.1242f)
                curveTo(21.1521f, 10.3161f, 21.7181f, 9.5148f, 22.1207f, 8.8686f)
                curveTo(22.384f, 8.446f, 22.5799f, 8.0858f, 22.7116f, 7.8277f)
                curveTo(22.7775f, 7.6985f, 22.8274f, 7.5945f, 22.8619f, 7.5207f)
                curveTo(22.8791f, 7.4837f, 22.8924f, 7.4543f, 22.902f, 7.433f)
                lineTo(22.9134f, 7.4071f)
                lineTo(22.917f, 7.3989f)
                lineTo(22.9191f, 7.3939f)
                curveTo(23.1367f, 6.8862f, 22.9015f, 6.2984f, 22.3939f, 6.0808f)
                curveTo(21.8864f, 5.8633f, 21.2985f, 6.0987f, 21.0809f, 6.606f)
                lineTo(21.0759f, 6.6172f)
                curveTo(21.0706f, 6.629f, 21.0617f, 6.6487f, 21.0492f, 6.6756f)
                curveTo(21.0241f, 6.7294f, 20.9844f, 6.8121f, 20.9299f, 6.919f)
                curveTo(20.8207f, 7.1331f, 20.6526f, 7.4429f, 20.4233f, 7.8109f)
                curveTo(19.9628f, 8.55f, 19.2652f, 9.5083f, 18.3156f, 10.3997f)
                curveTo(17.4746f, 11.1891f, 16.4469f, 11.9156f, 15.2209f, 12.3981f)
                close()
            }
        }
            .build()
        return _eyeClosed!!
    }

private var _eyeClosed: ImageVector? = null
