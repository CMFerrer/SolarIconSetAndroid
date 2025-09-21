package dev.chiksmedina.solar.outline.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.VideoAudioSoundGroup

val VideoAudioSoundGroup.Panorama: ImageVector
    get() {
        if (_panorama != null) {
            return _panorama!!
        }
        _panorama = Builder(
            name = "Panorama", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(17.7971f, 3.3568f)
                curveTo(18.441f, 2.8672f, 19.3233f, 2.6892f, 20.1838f, 3.066f)
                curveTo(20.894f, 3.3771f, 21.5116f, 3.7492f, 21.9628f, 4.1897f)
                curveTo(22.416f, 4.6321f, 22.75f, 5.195f, 22.75f, 5.8599f)
                verticalLineTo(18.5764f)
                curveTo(22.75f, 19.3688f, 22.2796f, 20.0115f, 21.686f, 20.492f)
                curveTo(21.0861f, 20.9776f, 20.2637f, 21.3817f, 19.314f, 21.7069f)
                curveTo(17.4072f, 22.3597f, 14.8213f, 22.7501f, 12.0f, 22.7501f)
                curveTo(9.1787f, 22.7501f, 6.5928f, 22.3597f, 4.686f, 21.7069f)
                curveTo(3.7363f, 21.3817f, 2.9139f, 20.9776f, 2.314f, 20.492f)
                curveTo(1.7204f, 20.0115f, 1.25f, 19.3688f, 1.25f, 18.5764f)
                verticalLineTo(5.8599f)
                curveTo(1.25f, 5.195f, 1.584f, 4.6321f, 2.0372f, 4.1897f)
                curveTo(2.4884f, 3.7492f, 3.106f, 3.3771f, 3.8162f, 3.066f)
                curveTo(4.6767f, 2.6892f, 5.559f, 2.8672f, 6.203f, 3.3568f)
                curveTo(6.8369f, 3.8388f, 7.25f, 4.6248f, 7.25f, 5.5022f)
                verticalLineTo(8.1102f)
                curveTo(8.6441f, 8.3784f, 10.2649f, 8.5336f, 12.0f, 8.5336f)
                curveTo(13.7351f, 8.5336f, 15.3559f, 8.3784f, 16.75f, 8.1102f)
                verticalLineTo(5.5022f)
                curveTo(16.75f, 4.6248f, 17.1631f, 3.8388f, 17.7971f, 3.3568f)
                close()
                moveTo(18.25f, 7.7534f)
                curveTo(19.134f, 7.4971f, 19.8512f, 7.1946f, 20.3705f, 6.8715f)
                curveTo(21.0928f, 6.4222f, 21.25f, 6.0564f, 21.25f, 5.8599f)
                curveTo(21.25f, 5.7302f, 21.1887f, 5.5302f, 20.915f, 5.2631f)
                curveTo(20.6393f, 4.9939f, 20.1984f, 4.7099f, 19.5821f, 4.44f)
                curveTo(19.2679f, 4.3025f, 18.9588f, 4.3579f, 18.7049f, 4.5509f)
                curveTo(18.441f, 4.7515f, 18.25f, 5.0973f, 18.25f, 5.5022f)
                verticalLineTo(7.7534f)
                close()
                moveTo(21.25f, 8.0899f)
                curveTo(21.2211f, 8.1086f, 21.192f, 8.127f, 21.1628f, 8.1452f)
                curveTo(20.279f, 8.695f, 19.065f, 9.1351f, 17.6653f, 9.4513f)
                curveTo(16.0264f, 9.8215f, 14.0801f, 10.0336f, 12.0f, 10.0336f)
                curveTo(9.9199f, 10.0336f, 7.9736f, 9.8215f, 6.3348f, 9.4513f)
                curveTo(4.935f, 9.1351f, 3.721f, 8.695f, 2.8372f, 8.1452f)
                curveTo(2.808f, 8.127f, 2.7789f, 8.1086f, 2.75f, 8.0899f)
                verticalLineTo(17.8425f)
                lineTo(5.793f, 14.9948f)
                lineTo(7.165f, 13.8464f)
                curveTo(8.1622f, 13.0117f, 9.6562f, 13.0575f, 10.5965f, 13.957f)
                lineTo(13.9176f, 17.1339f)
                curveTo(14.1922f, 17.3966f, 14.6395f, 17.4374f, 14.9659f, 17.2179f)
                lineTo(15.1967f, 17.0627f)
                curveTo(16.3608f, 16.2802f, 17.9311f, 16.3683f, 18.9937f, 17.2831f)
                lineTo(21.0374f, 19.0426f)
                curveTo(21.2064f, 18.8414f, 21.25f, 18.6833f, 21.25f, 18.5764f)
                verticalLineTo(8.0899f)
                close()
                moveTo(19.7551f, 19.9179f)
                lineTo(18.015f, 18.4199f)
                curveTo(17.468f, 17.9489f, 16.6413f, 17.8991f, 16.0336f, 18.3076f)
                lineTo(15.8028f, 18.4628f)
                curveTo(14.8979f, 19.0711f, 13.6701f, 18.973f, 12.8807f, 18.2178f)
                lineTo(9.5596f, 15.0409f)
                curveTo(9.1742f, 14.6722f, 8.5416f, 14.6503f, 8.1278f, 14.9966f)
                lineTo(6.7876f, 16.1184f)
                lineTo(3.3131f, 19.3698f)
                curveTo(3.7264f, 19.6888f, 4.3496f, 20.0062f, 5.1719f, 20.2877f)
                curveTo(6.8843f, 20.874f, 9.2985f, 21.2501f, 12.0f, 21.2501f)
                curveTo(14.7015f, 21.2501f, 17.1157f, 20.874f, 18.8281f, 20.2877f)
                curveTo(19.1723f, 20.1699f, 19.4815f, 20.0458f, 19.7551f, 19.9179f)
                close()
                moveTo(2.75f, 5.8599f)
                curveTo(2.75f, 6.0564f, 2.9072f, 6.4222f, 3.6295f, 6.8715f)
                curveTo(4.1488f, 7.1946f, 4.866f, 7.4971f, 5.75f, 7.7534f)
                verticalLineTo(5.5022f)
                curveTo(5.75f, 5.0973f, 5.559f, 4.7515f, 5.2951f, 4.5509f)
                curveTo(5.0412f, 4.3579f, 4.7321f, 4.3025f, 4.4179f, 4.44f)
                curveTo(3.8016f, 4.7099f, 3.3607f, 4.9939f, 3.085f, 5.2631f)
                curveTo(2.8113f, 5.5302f, 2.75f, 5.7302f, 2.75f, 5.8599f)
                close()
                moveTo(18.0f, 12.2501f)
                curveTo(17.5858f, 12.2501f, 17.25f, 12.5859f, 17.25f, 13.0001f)
                curveTo(17.25f, 13.4143f, 17.5858f, 13.7501f, 18.0f, 13.7501f)
                curveTo(18.4142f, 13.7501f, 18.75f, 13.4143f, 18.75f, 13.0001f)
                curveTo(18.75f, 12.5859f, 18.4142f, 12.2501f, 18.0f, 12.2501f)
                close()
                moveTo(15.75f, 13.0001f)
                curveTo(15.75f, 11.7574f, 16.7574f, 10.7501f, 18.0f, 10.7501f)
                curveTo(19.2426f, 10.7501f, 20.25f, 11.7574f, 20.25f, 13.0001f)
                curveTo(20.25f, 14.2427f, 19.2426f, 15.2501f, 18.0f, 15.2501f)
                curveTo(16.7574f, 15.2501f, 15.75f, 14.2427f, 15.75f, 13.0001f)
                close()
            }
        }
            .build()
        return _panorama!!
    }

private var _panorama: ImageVector? = null
