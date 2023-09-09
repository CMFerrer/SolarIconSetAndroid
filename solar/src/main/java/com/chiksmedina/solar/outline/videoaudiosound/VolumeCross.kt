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

public val VideoAudioSoundGroup.VolumeCross: ImageVector
    get() {
        if (_volumeCross != null) {
            return _volumeCross!!
        }
        _volumeCross = Builder(name = "VolumeCross", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.5303f, 1.4697f)
                curveTo(22.8232f, 1.7626f, 22.8232f, 2.2374f, 22.5303f, 2.5303f)
                lineTo(2.5303f, 22.5303f)
                curveTo(2.2374f, 22.8232f, 1.7626f, 22.8232f, 1.4697f, 22.5303f)
                curveTo(1.1768f, 22.2374f, 1.1768f, 21.7626f, 1.4697f, 21.4697f)
                lineTo(5.1912f, 17.7481f)
                curveTo(4.308f, 17.7386f, 3.6355f, 17.6859f, 3.025f, 17.4034f)
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
                curveTo(7.5845f, 5.9882f, 7.7386f, 5.8894f, 8.1865f, 5.5941f)
                lineTo(8.4532f, 5.4182f)
                curveTo(9.6841f, 4.6066f, 10.6712f, 3.9558f, 11.4848f, 3.5605f)
                curveTo(12.3108f, 3.1593f, 13.1241f, 2.9361f, 13.9423f, 3.2153f)
                curveTo(14.2142f, 3.3081f, 14.4759f, 3.4413f, 14.7109f, 3.6065f)
                curveTo(15.3503f, 4.0558f, 15.6552f, 4.7414f, 15.827f, 5.5298f)
                curveTo(15.9146f, 5.932f, 15.9746f, 6.3953f, 16.0205f, 6.9189f)
                lineTo(21.4697f, 1.4697f)
                curveTo(21.7626f, 1.1768f, 22.2374f, 1.1768f, 22.5303f, 1.4697f)
                close()
                moveTo(14.6104f, 8.3289f)
                curveTo(14.5528f, 7.228f, 14.4889f, 6.4347f, 14.3614f, 5.8491f)
                curveTo(14.2254f, 5.2253f, 14.0443f, 4.9714f, 13.8485f, 4.8337f)
                curveTo(13.7297f, 4.7502f, 13.5952f, 4.6818f, 13.4578f, 4.6349f)
                curveTo(13.2087f, 4.5499f, 12.8525f, 4.5638f, 12.1402f, 4.9098f)
                curveTo(11.426f, 5.2568f, 10.5209f, 5.8516f, 9.2311f, 6.7021f)
                lineTo(9.0122f, 6.8464f)
                curveTo(8.9955f, 6.8574f, 8.9791f, 6.8682f, 8.9628f, 6.8789f)
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
                curveTo(6.2989f, 16.25f, 6.4998f, 16.2499f, 6.6818f, 16.2576f)
                lineTo(14.6104f, 8.3289f)
                close()
                moveTo(20.2645f, 6.3164f)
                curveTo(20.642f, 6.146f, 21.0862f, 6.314f, 21.2565f, 6.6916f)
                curveTo(21.7236f, 7.7267f, 22.25f, 9.4596f, 22.25f, 12.0f)
                curveTo(22.25f, 14.1916f, 21.8582f, 15.7829f, 21.45f, 16.8442f)
                curveTo(21.2462f, 17.374f, 21.0394f, 17.7692f, 20.8775f, 18.039f)
                curveTo(20.7966f, 18.1738f, 20.727f, 18.2772f, 20.6748f, 18.3504f)
                curveTo(20.6486f, 18.3869f, 20.6269f, 18.4159f, 20.6102f, 18.4375f)
                curveTo(20.6018f, 18.4483f, 20.5948f, 18.4572f, 20.5891f, 18.4643f)
                lineTo(20.5816f, 18.4736f)
                lineTo(20.5786f, 18.4772f)
                lineTo(20.5773f, 18.4788f)
                curveTo(20.577f, 18.4791f, 20.5762f, 18.4801f, 20.0f, 18.0f)
                lineTo(20.5762f, 18.4801f)
                curveTo(20.311f, 18.7983f, 19.8381f, 18.8413f, 19.5199f, 18.5762f)
                curveTo(19.2032f, 18.3123f, 19.1591f, 17.8426f, 19.42f, 17.5244f)
                curveTo(19.4207f, 17.5237f, 19.4218f, 17.5222f, 19.4235f, 17.52f)
                curveTo(19.4288f, 17.5132f, 19.4393f, 17.4994f, 19.4542f, 17.4785f)
                curveTo(19.4839f, 17.4368f, 19.5315f, 17.3668f, 19.5913f, 17.2673f)
                curveTo(19.7106f, 17.0683f, 19.8788f, 16.751f, 20.05f, 16.3058f)
                curveTo(20.3918f, 15.4171f, 20.75f, 14.0084f, 20.75f, 12.0f)
                curveTo(20.75f, 9.6737f, 20.2694f, 8.151f, 19.8893f, 7.3085f)
                curveTo(19.7189f, 6.9309f, 19.8869f, 6.4868f, 20.2645f, 6.3164f)
                close()
                moveTo(18.164f, 9.2657f)
                curveTo(18.5696f, 9.1815f, 18.9666f, 9.442f, 19.0508f, 9.8475f)
                curveTo(19.1609f, 10.378f, 19.25f, 11.0889f, 19.25f, 12.0f)
                curveTo(19.25f, 13.1101f, 19.1178f, 13.9228f, 18.9765f, 14.4738f)
                curveTo(18.9059f, 14.749f, 18.8333f, 14.9579f, 18.7745f, 15.1051f)
                curveTo(18.7451f, 15.1787f, 18.7191f, 15.2367f, 18.6986f, 15.2797f)
                curveTo(18.6884f, 15.3012f, 18.6795f, 15.3189f, 18.6723f, 15.333f)
                lineTo(18.6626f, 15.3514f)
                lineTo(18.6588f, 15.3585f)
                lineTo(18.6571f, 15.3615f)
                lineTo(18.6563f, 15.3629f)
                curveTo(18.6562f, 15.3632f, 18.6556f, 15.3642f, 18.0276f, 15.0153f)
                lineTo(18.6556f, 15.3642f)
                curveTo(18.4545f, 15.7263f, 17.9979f, 15.8568f, 17.6358f, 15.6556f)
                curveTo(17.2768f, 15.4562f, 17.1455f, 15.0056f, 17.3393f, 14.645f)
                lineTo(17.3443f, 14.6348f)
                curveTo(17.3512f, 14.6204f, 17.3643f, 14.5917f, 17.3818f, 14.548f)
                curveTo(17.4167f, 14.4608f, 17.4691f, 14.3135f, 17.5235f, 14.1012f)
                curveTo(17.6322f, 13.6772f, 17.75f, 12.9899f, 17.75f, 12.0f)
                curveTo(17.75f, 11.1873f, 17.6706f, 10.5787f, 17.5821f, 10.1525f)
                curveTo(17.4979f, 9.7469f, 17.7584f, 9.3499f, 18.164f, 9.2657f)
                close()
                moveTo(15.5f, 11.25f)
                curveTo(15.9142f, 11.25f, 16.25f, 11.5858f, 16.25f, 12.0f)
                curveTo(16.25f, 12.552f, 16.2137f, 13.5253f, 16.1619f, 14.6402f)
                lineTo(16.1592f, 14.6977f)
                curveTo(16.0914f, 16.1576f, 16.037f, 17.3296f, 15.8778f, 18.2139f)
                curveTo(15.7159f, 19.1134f, 15.417f, 19.8974f, 14.7109f, 20.3936f)
                curveTo(14.4759f, 20.5588f, 14.2142f, 20.692f, 13.9423f, 20.7848f)
                curveTo(13.2003f, 21.038f, 12.4627f, 20.8773f, 11.7204f, 20.549f)
                curveTo(10.9875f, 20.2248f, 10.1277f, 19.6808f, 9.0889f, 19.0001f)
                curveTo(8.7425f, 18.7731f, 8.6457f, 18.3082f, 8.8727f, 17.9617f)
                curveTo(9.0997f, 17.6153f, 9.5646f, 17.5184f, 9.9111f, 17.7455f)
                curveTo(10.9698f, 18.4393f, 11.7264f, 18.9114f, 12.3272f, 19.1772f)
                curveTo(12.9187f, 19.4389f, 13.2324f, 19.4421f, 13.4578f, 19.3651f)
                curveTo(13.5952f, 19.3183f, 13.7297f, 19.2498f, 13.8485f, 19.1664f)
                curveTo(14.0651f, 19.0141f, 14.2626f, 18.7195f, 14.4015f, 17.9482f)
                curveTo(14.541f, 17.1733f, 14.5924f, 16.1014f, 14.6635f, 14.5706f)
                curveTo(14.7156f, 13.451f, 14.75f, 12.5118f, 14.75f, 12.0f)
                curveTo(14.75f, 11.5858f, 15.0858f, 11.25f, 15.5f, 11.25f)
                close()
            }
        }
        .build()
        return _volumeCross!!
    }

private var _volumeCross: ImageVector? = null
