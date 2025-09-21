package dev.chiksmedina.solar.outline.videoaudiosound

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
import dev.chiksmedina.solar.outline.VideoAudioSoundGroup

val VideoAudioSoundGroup.VolumeSmall: ImageVector
    get() {
        if (_volumeSmall != null) {
            return _volumeSmall!!
        }
        _volumeSmall = Builder(
            name = "VolumeSmall", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.1402f, 4.9098f)
                curveTo(11.426f, 5.2567f, 10.5209f, 5.8516f, 9.2311f, 6.7021f)
                lineTo(9.0122f, 6.8464f)
                curveTo(8.9955f, 6.8574f, 8.979f, 6.8682f, 8.9628f, 6.879f)
                curveTo(8.5826f, 7.1297f, 8.3193f, 7.3034f, 8.0308f, 7.4308f)
                curveTo(7.7464f, 7.5563f, 7.4476f, 7.6459f, 7.1411f, 7.6977f)
                curveTo(6.8301f, 7.7502f, 6.5146f, 7.7501f, 6.0592f, 7.75f)
                curveTo(6.0397f, 7.75f, 6.02f, 7.75f, 6.0001f, 7.75f)
                curveTo(4.5564f, 7.75f, 4.0691f, 7.7663f, 3.6548f, 7.958f)
                curveTo(3.2545f, 8.1432f, 2.828f, 8.5444f, 2.6188f, 8.9328f)
                curveTo(2.4005f, 9.3379f, 2.3605f, 9.7531f, 2.2834f, 11.0173f)
                curveTo(2.2622f, 11.3642f, 2.25f, 11.6968f, 2.25f, 12.0f)
                curveTo(2.25f, 12.3033f, 2.2622f, 12.6358f, 2.2834f, 12.9828f)
                curveTo(2.3605f, 14.247f, 2.4005f, 14.6622f, 2.6188f, 15.0673f)
                curveTo(2.828f, 15.4556f, 3.2545f, 15.8568f, 3.6548f, 16.0421f)
                curveTo(4.0691f, 16.2338f, 4.5564f, 16.25f, 6.0001f, 16.25f)
                curveTo(6.02f, 16.25f, 6.0397f, 16.25f, 6.0592f, 16.25f)
                curveTo(6.5146f, 16.2499f, 6.8301f, 16.2499f, 7.1411f, 16.3024f)
                curveTo(7.4476f, 16.3541f, 7.7464f, 16.4438f, 8.0308f, 16.5693f)
                curveTo(8.3193f, 16.6966f, 8.5826f, 16.8703f, 8.9628f, 17.1211f)
                curveTo(8.979f, 17.1318f, 8.9955f, 17.1427f, 9.0122f, 17.1537f)
                lineTo(9.2311f, 17.298f)
                curveTo(10.5209f, 18.1484f, 11.426f, 18.7433f, 12.1402f, 19.0903f)
                curveTo(12.8525f, 19.4363f, 13.2087f, 19.4502f, 13.4578f, 19.3651f)
                curveTo(13.5952f, 19.3183f, 13.7297f, 19.2498f, 13.8485f, 19.1664f)
                curveTo(14.0651f, 19.0141f, 14.2626f, 18.7195f, 14.4015f, 17.9482f)
                curveTo(14.541f, 17.1733f, 14.5924f, 16.1014f, 14.6635f, 14.5706f)
                curveTo(14.7156f, 13.451f, 14.75f, 12.5118f, 14.75f, 12.0f)
                curveTo(14.75f, 11.4883f, 14.7156f, 10.549f, 14.6635f, 9.4295f)
                curveTo(14.5924f, 7.8987f, 14.541f, 6.8268f, 14.4015f, 6.0519f)
                curveTo(14.2626f, 5.2805f, 14.0651f, 4.9859f, 13.8485f, 4.8337f)
                curveTo(13.7297f, 4.7502f, 13.5952f, 4.6818f, 13.4578f, 4.6349f)
                curveTo(13.2087f, 4.5499f, 12.8525f, 4.5638f, 12.1402f, 4.9098f)
                close()
                moveTo(11.4848f, 3.5605f)
                curveTo(12.3108f, 3.1593f, 13.1241f, 2.9361f, 13.9423f, 3.2153f)
                curveTo(14.2142f, 3.3081f, 14.4759f, 3.4413f, 14.7109f, 3.6065f)
                curveTo(15.417f, 4.1027f, 15.7159f, 4.8867f, 15.8778f, 5.7861f)
                curveTo(16.037f, 6.6705f, 16.0914f, 7.8424f, 16.1592f, 9.3023f)
                lineTo(16.1619f, 9.3598f)
                curveTo(16.2137f, 10.4748f, 16.25f, 11.448f, 16.25f, 12.0f)
                curveTo(16.25f, 12.552f, 16.2137f, 13.5253f, 16.1619f, 14.6402f)
                lineTo(16.1592f, 14.6977f)
                curveTo(16.0914f, 16.1576f, 16.037f, 17.3296f, 15.8778f, 18.2139f)
                curveTo(15.7159f, 19.1134f, 15.417f, 19.8974f, 14.7109f, 20.3936f)
                curveTo(14.4759f, 20.5588f, 14.2142f, 20.692f, 13.9423f, 20.7848f)
                curveTo(13.1241f, 21.064f, 12.3108f, 20.8408f, 11.4848f, 20.4395f)
                curveTo(10.6712f, 20.0443f, 9.6841f, 19.3934f, 8.4533f, 18.5819f)
                lineTo(8.1865f, 18.4059f)
                curveTo(7.7386f, 18.1106f, 7.5845f, 18.0119f, 7.4251f, 17.9416f)
                curveTo(7.2545f, 17.8663f, 7.0752f, 17.8125f, 6.8913f, 17.7814f)
                curveTo(6.7196f, 17.7524f, 6.5366f, 17.75f, 6.0001f, 17.75f)
                curveTo(5.9457f, 17.75f, 5.892f, 17.7501f, 5.8391f, 17.7501f)
                curveTo(4.6221f, 17.7507f, 3.7766f, 17.7512f, 3.025f, 17.4034f)
                curveTo(2.3302f, 17.082f, 1.6614f, 16.4527f, 1.2983f, 15.7788f)
                curveTo(0.9057f, 15.0501f, 0.8596f, 14.2881f, 0.7941f, 13.2045f)
                curveTo(0.7915f, 13.1615f, 0.7889f, 13.1181f, 0.7862f, 13.0741f)
                curveTo(0.7637f, 12.7058f, 0.75f, 12.3416f, 0.75f, 12.0f)
                curveTo(0.75f, 11.6585f, 0.7637f, 11.2943f, 0.7862f, 10.926f)
                curveTo(0.7889f, 10.882f, 0.7915f, 10.8385f, 0.7941f, 10.7955f)
                curveTo(0.8596f, 9.712f, 0.9057f, 8.95f, 1.2983f, 8.2213f)
                curveTo(1.6614f, 7.5473f, 2.3302f, 6.9181f, 3.025f, 6.5966f)
                curveTo(3.7766f, 6.2489f, 4.6221f, 6.2493f, 5.8391f, 6.25f)
                curveTo(5.892f, 6.25f, 5.9457f, 6.25f, 6.0001f, 6.25f)
                curveTo(6.5366f, 6.25f, 6.7196f, 6.2476f, 6.8913f, 6.2186f)
                curveTo(7.0752f, 6.1876f, 7.2545f, 6.1338f, 7.4251f, 6.0585f)
                curveTo(7.5845f, 5.9882f, 7.7386f, 5.8895f, 8.1865f, 5.5941f)
                lineTo(8.4533f, 5.4182f)
                curveTo(9.6841f, 4.6066f, 10.6712f, 3.9558f, 11.4848f, 3.5605f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.6563f, 8.6371f)
                curveTo(18.4552f, 8.275f, 17.9979f, 8.1433f, 17.6358f, 8.3444f)
                curveTo(17.2768f, 8.5439f, 17.1455f, 8.9944f, 17.3393f, 9.355f)
                curveTo(17.3462f, 9.3694f, 17.3643f, 9.4084f, 17.3818f, 9.452f)
                curveTo(17.4167f, 9.5392f, 17.4691f, 9.6865f, 17.5235f, 9.8988f)
                curveTo(17.6322f, 10.3229f, 17.75f, 11.0101f, 17.75f, 12.0f)
                curveTo(17.75f, 12.9899f, 17.6322f, 13.6772f, 17.5235f, 14.1013f)
                curveTo(17.4691f, 14.3135f, 17.4167f, 14.4608f, 17.3818f, 14.5481f)
                lineTo(17.3393f, 14.645f)
                curveTo(17.1455f, 15.0056f, 17.2768f, 15.4562f, 17.6358f, 15.6557f)
                curveTo(17.9979f, 15.8568f, 18.4711f, 15.6951f, 18.6723f, 15.333f)
                curveTo(18.6795f, 15.319f, 18.6884f, 15.3012f, 18.6986f, 15.2797f)
                curveTo(18.7191f, 15.2367f, 18.7451f, 15.1787f, 18.7745f, 15.1051f)
                curveTo(18.8333f, 14.958f, 18.9059f, 14.749f, 18.9765f, 14.4738f)
                curveTo(19.1178f, 13.9229f, 19.25f, 13.1102f, 19.25f, 12.0f)
                curveTo(19.25f, 10.8899f, 19.1178f, 10.0772f, 18.9765f, 9.5262f)
                curveTo(18.9059f, 9.251f, 18.8333f, 9.0421f, 18.7745f, 8.8949f)
                curveTo(18.7451f, 8.8214f, 18.7191f, 8.7634f, 18.6986f, 8.7204f)
                curveTo(18.6884f, 8.6988f, 18.6636f, 8.6512f, 18.6563f, 8.6371f)
                close()
            }
        }
            .build()
        return _volumeSmall!!
    }

private var _volumeSmall: ImageVector? = null
