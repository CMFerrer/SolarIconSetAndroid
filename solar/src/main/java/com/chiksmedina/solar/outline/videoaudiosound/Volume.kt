package com.chiksmedina.solar.outline.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.VideoAudioSoundGroup

val VideoAudioSoundGroup.Volume: ImageVector
    get() {
        if (_volume != null) {
            return _volume!!
        }
        _volume = Builder(
            name = "Volume", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(15.6402f, 4.9098f)
                curveTo(14.926f, 5.2567f, 14.0209f, 5.8516f, 12.7311f, 6.7021f)
                lineTo(12.5122f, 6.8464f)
                curveTo(12.4955f, 6.8574f, 12.4791f, 6.8682f, 12.4628f, 6.879f)
                curveTo(12.0826f, 7.1297f, 11.8193f, 7.3034f, 11.5308f, 7.4308f)
                curveTo(11.2464f, 7.5563f, 10.9476f, 7.6459f, 10.6411f, 7.6977f)
                curveTo(10.3301f, 7.7502f, 10.0146f, 7.7501f, 9.5592f, 7.75f)
                curveTo(9.5397f, 7.75f, 9.52f, 7.75f, 9.5001f, 7.75f)
                curveTo(8.0564f, 7.75f, 7.5691f, 7.7663f, 7.1548f, 7.958f)
                curveTo(6.7544f, 8.1432f, 6.328f, 8.5444f, 6.1188f, 8.9328f)
                curveTo(5.9005f, 9.3379f, 5.8604f, 9.7531f, 5.7834f, 11.0173f)
                curveTo(5.7622f, 11.3642f, 5.75f, 11.6968f, 5.75f, 12.0f)
                curveTo(5.75f, 12.3033f, 5.7622f, 12.6358f, 5.7834f, 12.9828f)
                curveTo(5.8604f, 14.247f, 5.9005f, 14.6622f, 6.1188f, 15.0673f)
                curveTo(6.328f, 15.4556f, 6.7544f, 15.8568f, 7.1548f, 16.0421f)
                curveTo(7.5691f, 16.2338f, 8.0564f, 16.25f, 9.5001f, 16.25f)
                curveTo(9.52f, 16.25f, 9.5397f, 16.25f, 9.5592f, 16.25f)
                curveTo(10.0146f, 16.2499f, 10.3301f, 16.2499f, 10.6411f, 16.3024f)
                curveTo(10.9476f, 16.3541f, 11.2464f, 16.4438f, 11.5308f, 16.5693f)
                curveTo(11.8193f, 16.6966f, 12.0826f, 16.8703f, 12.4628f, 17.1211f)
                curveTo(12.479f, 17.1318f, 12.4955f, 17.1427f, 12.5122f, 17.1537f)
                lineTo(12.7311f, 17.298f)
                curveTo(14.0209f, 18.1484f, 14.926f, 18.7433f, 15.6402f, 19.0903f)
                curveTo(16.3525f, 19.4363f, 16.7087f, 19.4502f, 16.9578f, 19.3651f)
                curveTo(17.0952f, 19.3183f, 17.2297f, 19.2498f, 17.3485f, 19.1664f)
                curveTo(17.5651f, 19.0141f, 17.7626f, 18.7195f, 17.9015f, 17.9482f)
                curveTo(18.041f, 17.1733f, 18.0924f, 16.1014f, 18.1635f, 14.5706f)
                curveTo(18.2156f, 13.451f, 18.25f, 12.5118f, 18.25f, 12.0f)
                curveTo(18.25f, 11.4883f, 18.2156f, 10.549f, 18.1635f, 9.4295f)
                curveTo(18.0924f, 7.8987f, 18.041f, 6.8268f, 17.9015f, 6.0519f)
                curveTo(17.7626f, 5.2805f, 17.5651f, 4.9859f, 17.3485f, 4.8337f)
                curveTo(17.2297f, 4.7502f, 17.0952f, 4.6818f, 16.9578f, 4.6349f)
                curveTo(16.7087f, 4.5499f, 16.3525f, 4.5638f, 15.6402f, 4.9098f)
                close()
                moveTo(14.9848f, 3.5605f)
                curveTo(15.8108f, 3.1593f, 16.6241f, 2.9361f, 17.4423f, 3.2153f)
                curveTo(17.7142f, 3.3081f, 17.9759f, 3.4413f, 18.2109f, 3.6065f)
                curveTo(18.917f, 4.1027f, 19.2159f, 4.8867f, 19.3778f, 5.7861f)
                curveTo(19.537f, 6.6705f, 19.5914f, 7.8424f, 19.6592f, 9.3023f)
                lineTo(19.6619f, 9.3598f)
                curveTo(19.7137f, 10.4748f, 19.75f, 11.448f, 19.75f, 12.0f)
                curveTo(19.75f, 12.552f, 19.7137f, 13.5253f, 19.6619f, 14.6402f)
                lineTo(19.6592f, 14.6977f)
                curveTo(19.5914f, 16.1576f, 19.537f, 17.3296f, 19.3778f, 18.2139f)
                curveTo(19.2159f, 19.1134f, 18.917f, 19.8974f, 18.2109f, 20.3936f)
                curveTo(17.9759f, 20.5588f, 17.7142f, 20.692f, 17.4423f, 20.7848f)
                curveTo(16.6241f, 21.064f, 15.8108f, 20.8408f, 14.9848f, 20.4395f)
                curveTo(14.1712f, 20.0443f, 13.1841f, 19.3934f, 11.9533f, 18.5819f)
                lineTo(11.6865f, 18.4059f)
                curveTo(11.2386f, 18.1106f, 11.0845f, 18.0119f, 10.9251f, 17.9416f)
                curveTo(10.7545f, 17.8663f, 10.5752f, 17.8125f, 10.3913f, 17.7814f)
                curveTo(10.2196f, 17.7524f, 10.0366f, 17.75f, 9.5001f, 17.75f)
                curveTo(9.4457f, 17.75f, 9.392f, 17.7501f, 9.3391f, 17.7501f)
                curveTo(8.1222f, 17.7507f, 7.2766f, 17.7512f, 6.525f, 17.4034f)
                curveTo(5.8302f, 17.082f, 5.1614f, 16.4527f, 4.7983f, 15.7788f)
                curveTo(4.4057f, 15.0501f, 4.3596f, 14.2881f, 4.2941f, 13.2045f)
                curveTo(4.2915f, 13.1615f, 4.2889f, 13.1181f, 4.2862f, 13.0741f)
                curveTo(4.2637f, 12.7058f, 4.25f, 12.3416f, 4.25f, 12.0f)
                curveTo(4.25f, 11.6585f, 4.2637f, 11.2943f, 4.2862f, 10.926f)
                curveTo(4.2889f, 10.882f, 4.2915f, 10.8385f, 4.2941f, 10.7955f)
                curveTo(4.3596f, 9.712f, 4.4057f, 8.95f, 4.7983f, 8.2213f)
                curveTo(5.1614f, 7.5473f, 5.8302f, 6.9181f, 6.525f, 6.5966f)
                curveTo(7.2766f, 6.2489f, 8.1222f, 6.2493f, 9.3391f, 6.25f)
                curveTo(9.392f, 6.25f, 9.4457f, 6.25f, 9.5001f, 6.25f)
                curveTo(10.0366f, 6.25f, 10.2196f, 6.2476f, 10.3913f, 6.2186f)
                curveTo(10.5752f, 6.1876f, 10.7545f, 6.1338f, 10.9251f, 6.0585f)
                curveTo(11.0845f, 5.9882f, 11.2386f, 5.8895f, 11.6865f, 5.5941f)
                lineTo(11.9533f, 5.4182f)
                curveTo(13.1841f, 4.6066f, 14.1712f, 3.9558f, 14.9848f, 3.5605f)
                close()
            }
        }
            .build()
        return _volume!!
    }

private var _volume: ImageVector? = null
