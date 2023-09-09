package com.chiksmedina.solar.bold.security

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.SecurityGroup

public val SecurityGroup.EyeClosed: ImageVector
    get() {
        if (_eyeClosed != null) {
            return _eyeClosed!!
        }
        _eyeClosed = Builder(name = "EyeClosed", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.606f, 6.0809f)
                curveTo(2.1137f, 5.8633f, 2.7015f, 6.0985f, 2.9191f, 6.6061f)
                lineTo(2.0f, 7.0f)
                curveTo(2.9191f, 6.6061f, 2.9192f, 6.6064f, 2.9191f, 6.6061f)
                lineTo(2.9186f, 6.6049f)
                curveTo(2.9185f, 6.6047f, 2.9183f, 6.6042f, 2.9186f, 6.6049f)
                lineTo(2.9225f, 6.6137f)
                curveTo(2.9265f, 6.6228f, 2.9334f, 6.6381f, 2.9432f, 6.6593f)
                curveTo(2.9628f, 6.7017f, 2.994f, 6.7676f, 3.037f, 6.8536f)
                curveTo(3.123f, 7.0257f, 3.2559f, 7.2775f, 3.4374f, 7.5823f)
                curveTo(3.8014f, 8.1938f, 4.3544f, 9.0082f, 5.1077f, 9.8195f)
                curveTo(5.2853f, 10.0108f, 5.4732f, 10.2011f, 5.6717f, 10.388f)
                curveTo(5.68f, 10.3956f, 5.6882f, 10.4033f, 5.6963f, 10.4112f)
                curveTo(7.181f, 11.8014f, 9.2523f, 13.0f, 12.0f, 13.0f)
                curveTo(13.2089f, 13.0f, 14.2783f, 12.7692f, 15.2209f, 12.3982f)
                curveTo(16.4469f, 11.9156f, 17.4745f, 11.1891f, 18.3156f, 10.3997f)
                curveTo(19.2652f, 9.5084f, 19.9627f, 8.55f, 20.4232f, 7.811f)
                curveTo(20.6526f, 7.4429f, 20.8207f, 7.1332f, 20.9299f, 6.9191f)
                curveTo(20.9844f, 6.8122f, 21.0241f, 6.7294f, 21.0491f, 6.6756f)
                curveTo(21.0617f, 6.6487f, 21.0706f, 6.6291f, 21.0758f, 6.6173f)
                lineTo(21.0808f, 6.6061f)
                curveTo(21.2985f, 6.0987f, 21.8864f, 5.8633f, 22.3939f, 6.0809f)
                curveTo(22.9015f, 6.2984f, 23.1367f, 6.8863f, 22.9191f, 7.3939f)
                lineTo(22.0f, 7.0f)
                curveTo(22.9191f, 7.3939f, 22.9192f, 7.3937f, 22.9191f, 7.3939f)
                lineTo(22.9169f, 7.3989f)
                lineTo(22.9134f, 7.4072f)
                lineTo(22.9019f, 7.433f)
                curveTo(22.8924f, 7.4543f, 22.879f, 7.4838f, 22.8618f, 7.5207f)
                curveTo(22.8274f, 7.5946f, 22.7774f, 7.6985f, 22.7115f, 7.8277f)
                curveTo(22.5799f, 8.0859f, 22.384f, 8.4461f, 22.1206f, 8.8687f)
                curveTo(21.718f, 9.5148f, 21.152f, 10.3162f, 20.4096f, 11.1243f)
                lineTo(21.2071f, 11.9217f)
                curveTo(21.5976f, 12.3123f, 21.5976f, 12.9454f, 21.2071f, 13.3359f)
                curveTo(20.8165f, 13.7265f, 20.1834f, 13.7265f, 19.7928f, 13.3359f)
                lineTo(18.9527f, 12.4958f)
                curveTo(18.3884f, 12.9515f, 17.7569f, 13.3814f, 17.0558f, 13.7522f)
                lineTo(17.8381f, 14.9546f)
                curveTo(18.1393f, 15.4175f, 18.0083f, 16.037f, 17.5453f, 16.3382f)
                curveTo(17.0824f, 16.6394f, 16.463f, 16.5083f, 16.1618f, 16.0454f)
                lineTo(15.1763f, 14.5309f)
                curveTo(14.4973f, 14.739f, 13.772f, 14.8865f, 13.0f, 14.9557f)
                verticalLineTo(16.5f)
                curveTo(13.0f, 17.0523f, 12.5522f, 17.5f, 12.0f, 17.5f)
                curveTo(11.4477f, 17.5f, 11.0f, 17.0523f, 11.0f, 16.5f)
                verticalLineTo(14.9558f)
                curveTo(10.2253f, 14.8866f, 9.5001f, 14.7388f, 8.8233f, 14.5313f)
                lineTo(7.8381f, 16.0454f)
                curveTo(7.5369f, 16.5083f, 6.9175f, 16.6394f, 6.4546f, 16.3382f)
                curveTo(5.9917f, 16.037f, 5.8606f, 15.4175f, 6.1618f, 14.9546f)
                lineTo(6.9442f, 13.7522f)
                curveTo(6.2441f, 13.3816f, 5.6125f, 12.9518f, 5.0475f, 12.4955f)
                lineTo(4.2071f, 13.3359f)
                curveTo(3.8165f, 13.7265f, 3.1834f, 13.7265f, 2.7929f, 13.3359f)
                curveTo(2.4023f, 12.9454f, 2.4023f, 12.3123f, 2.7929f, 11.9217f)
                lineTo(3.5903f, 11.1243f)
                curveTo(2.7453f, 10.2045f, 2.1277f, 9.2922f, 1.7188f, 8.6052f)
                curveTo(1.5096f, 8.2538f, 1.3534f, 7.9587f, 1.2481f, 7.748f)
                curveTo(1.1954f, 7.6426f, 1.1553f, 7.5581f, 1.1275f, 7.4979f)
                curveTo(1.1136f, 7.4679f, 1.1028f, 7.4439f, 1.095f, 7.4264f)
                lineTo(1.0857f, 7.4051f)
                lineTo(1.0827f, 7.3982f)
                lineTo(1.0816f, 7.3958f)
                lineTo(1.0812f, 7.3948f)
                curveTo(1.081f, 7.3943f, 1.0808f, 7.3939f, 2.0f, 7.0f)
                lineTo(1.0812f, 7.3948f)
                curveTo(0.8636f, 6.8871f, 1.0984f, 6.2984f, 1.606f, 6.0809f)
                close()
            }
        }
        .build()
        return _eyeClosed!!
    }

private var _eyeClosed: ImageVector? = null
