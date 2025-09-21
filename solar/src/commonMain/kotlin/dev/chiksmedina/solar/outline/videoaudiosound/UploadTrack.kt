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

val VideoAudioSoundGroup.UploadTrack: ImageVector
    get() {
        if (_uploadTrack != null) {
            return _uploadTrack!!
        }
        _uploadTrack = Builder(
            name = "UploadTrack", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 2.75f)
                curveTo(6.8914f, 2.75f, 2.75f, 6.8914f, 2.75f, 12.0f)
                curveTo(2.75f, 17.1086f, 6.8914f, 21.25f, 12.0f, 21.25f)
                curveTo(12.6345f, 21.25f, 13.2534f, 21.1862f, 13.8508f, 21.065f)
                curveTo(14.2567f, 20.9826f, 14.6526f, 21.2448f, 14.735f, 21.6508f)
                curveTo(14.8174f, 22.0567f, 14.5551f, 22.4526f, 14.1492f, 22.535f)
                curveTo(13.4541f, 22.6761f, 12.7353f, 22.75f, 12.0f, 22.75f)
                curveTo(6.0629f, 22.75f, 1.25f, 17.9371f, 1.25f, 12.0f)
                curveTo(1.25f, 6.0629f, 6.0629f, 1.25f, 12.0f, 1.25f)
                curveTo(17.9371f, 1.25f, 22.75f, 6.0629f, 22.75f, 12.0f)
                curveTo(22.75f, 12.7353f, 22.6761f, 13.4541f, 22.535f, 14.1492f)
                curveTo(22.4526f, 14.5551f, 22.0567f, 14.8174f, 21.6508f, 14.735f)
                curveTo(21.2448f, 14.6526f, 20.9826f, 14.2567f, 21.065f, 13.8508f)
                curveTo(21.1862f, 13.2534f, 21.25f, 12.6345f, 21.25f, 12.0f)
                curveTo(21.25f, 6.8914f, 17.1086f, 2.75f, 12.0f, 2.75f)
                close()
                moveTo(12.7676f, 8.5258f)
                curveTo(12.7661f, 8.5341f, 12.7604f, 8.5673f, 12.7564f, 8.6434f)
                curveTo(12.7502f, 8.761f, 12.75f, 8.9198f, 12.75f, 9.1708f)
                curveTo(12.75f, 9.278f, 12.7501f, 9.339f, 12.7518f, 9.3853f)
                curveTo(12.7528f, 9.4143f, 12.7542f, 9.4265f, 12.7546f, 9.4296f)
                curveTo(12.7662f, 9.4895f, 12.7993f, 9.543f, 12.8477f, 9.5802f)
                curveTo(12.8502f, 9.5819f, 12.8606f, 9.5886f, 12.886f, 9.6025f)
                curveTo(12.9266f, 9.6247f, 12.9812f, 9.6521f, 13.0771f, 9.7f)
                lineTo(14.3938f, 10.3584f)
                curveTo(14.6183f, 10.4706f, 14.7604f, 10.5414f, 14.8684f, 10.5885f)
                curveTo(14.9382f, 10.6189f, 14.9705f, 10.6287f, 14.9785f, 10.631f)
                curveTo(15.0885f, 10.6405f, 15.1917f, 10.5767f, 15.2324f, 10.4742f)
                curveTo(15.2339f, 10.4659f, 15.2396f, 10.4327f, 15.2436f, 10.3566f)
                curveTo(15.2498f, 10.239f, 15.25f, 10.0802f, 15.25f, 9.8292f)
                curveTo(15.25f, 9.722f, 15.2499f, 9.661f, 15.2482f, 9.6147f)
                curveTo(15.2472f, 9.5857f, 15.2458f, 9.5735f, 15.2454f, 9.5704f)
                curveTo(15.2338f, 9.5105f, 15.2007f, 9.457f, 15.1523f, 9.4198f)
                curveTo(15.1498f, 9.418f, 15.1394f, 9.4114f, 15.114f, 9.3975f)
                curveTo(15.0734f, 9.3753f, 15.0188f, 9.3479f, 14.9229f, 9.3f)
                lineTo(13.6062f, 8.6416f)
                curveTo(13.3817f, 8.5294f, 13.2396f, 8.4586f, 13.1316f, 8.4115f)
                curveTo(13.0617f, 8.3811f, 13.0295f, 8.3713f, 13.0215f, 8.369f)
                curveTo(12.9115f, 8.3595f, 12.8083f, 8.4233f, 12.7676f, 8.5258f)
                close()
                moveTo(12.75f, 11.2135f)
                lineTo(13.7396f, 11.7083f)
                curveTo(13.9425f, 11.8098f, 14.1204f, 11.8987f, 14.269f, 11.9635f)
                curveTo(14.4199f, 12.0293f, 14.5988f, 12.097f, 14.7972f, 12.1202f)
                curveTo(15.6037f, 12.2142f, 16.3689f, 11.7413f, 16.6454f, 10.978f)
                curveTo(16.7134f, 10.7901f, 16.7328f, 10.5998f, 16.7415f, 10.4355f)
                curveTo(16.75f, 10.2735f, 16.75f, 10.0747f, 16.75f, 9.8479f)
                verticalLineTo(9.8292f)
                curveTo(16.75f, 9.8156f, 16.75f, 9.802f, 16.75f, 9.7884f)
                curveTo(16.7503f, 9.6265f, 16.7505f, 9.4547f, 16.7188f, 9.289f)
                curveTo(16.638f, 8.8667f, 16.4045f, 8.489f, 16.0629f, 8.2278f)
                curveTo(15.9289f, 8.1253f, 15.7752f, 8.0488f, 15.6303f, 7.9766f)
                curveTo(15.618f, 7.9705f, 15.6059f, 7.9644f, 15.5938f, 7.9584f)
                lineTo(14.2603f, 7.2916f)
                curveTo(14.0575f, 7.1902f, 13.8796f, 7.1013f, 13.731f, 7.0365f)
                curveTo(13.5801f, 6.9707f, 13.4012f, 6.903f, 13.2028f, 6.8798f)
                curveTo(12.3963f, 6.7857f, 11.6311f, 7.2587f, 11.3546f, 8.022f)
                curveTo(11.2866f, 8.2099f, 11.2672f, 8.4002f, 11.2585f, 8.5645f)
                curveTo(11.2519f, 8.6892f, 11.2504f, 8.8357f, 11.2501f, 9.0f)
                lineTo(11.25f, 9.1194f)
                curveTo(11.25f, 9.1303f, 11.25f, 9.1412f, 11.25f, 9.1521f)
                verticalLineTo(9.1708f)
                curveTo(11.25f, 9.1844f, 11.25f, 9.198f, 11.25f, 9.2116f)
                curveTo(11.2499f, 9.2392f, 11.2499f, 9.267f, 11.25f, 9.295f)
                verticalLineTo(12.5499f)
                curveTo(10.875f, 12.3581f, 10.4501f, 12.25f, 10.0f, 12.25f)
                curveTo(8.4812f, 12.25f, 7.25f, 13.4812f, 7.25f, 15.0f)
                curveTo(7.25f, 16.5188f, 8.4812f, 17.75f, 10.0f, 17.75f)
                curveTo(11.5188f, 17.75f, 12.75f, 16.5188f, 12.75f, 15.0f)
                verticalLineTo(11.2135f)
                close()
                moveTo(11.25f, 15.0f)
                curveTo(11.25f, 14.3096f, 10.6904f, 13.75f, 10.0f, 13.75f)
                curveTo(9.3096f, 13.75f, 8.75f, 14.3096f, 8.75f, 15.0f)
                curveTo(8.75f, 15.6904f, 9.3096f, 16.25f, 10.0f, 16.25f)
                curveTo(10.6904f, 16.25f, 11.25f, 15.6904f, 11.25f, 15.0f)
                close()
                moveTo(17.4697f, 14.4697f)
                curveTo(17.7626f, 14.1768f, 18.2374f, 14.1768f, 18.5303f, 14.4697f)
                lineTo(21.0303f, 16.9697f)
                curveTo(21.3232f, 17.2626f, 21.3232f, 17.7374f, 21.0303f, 18.0303f)
                curveTo(20.7374f, 18.3232f, 20.2626f, 18.3232f, 19.9697f, 18.0303f)
                lineTo(18.75f, 16.8107f)
                verticalLineTo(22.0f)
                curveTo(18.75f, 22.4142f, 18.4142f, 22.75f, 18.0f, 22.75f)
                curveTo(17.5858f, 22.75f, 17.25f, 22.4142f, 17.25f, 22.0f)
                verticalLineTo(16.8107f)
                lineTo(16.0303f, 18.0303f)
                curveTo(15.7374f, 18.3232f, 15.2626f, 18.3232f, 14.9697f, 18.0303f)
                curveTo(14.6768f, 17.7374f, 14.6768f, 17.2626f, 14.9697f, 16.9697f)
                lineTo(17.4697f, 14.4697f)
                close()
            }
        }
            .build()
        return _uploadTrack!!
    }

private var _uploadTrack: ImageVector? = null
