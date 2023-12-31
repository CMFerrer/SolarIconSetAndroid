package com.chiksmedina.solar.linear.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.VideoAudioSoundGroup

val VideoAudioSoundGroup.VolumeCross: ImageVector
    get() {
        if (_volumeCross != null) {
            return _volumeCross!!
        }
        _volumeCross = Builder(
            name = "VolumeCross", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.25f, 11.9998f)
                curveTo(16.25f, 11.5856f, 15.9142f, 11.2498f, 15.5f, 11.2498f)
                curveTo(15.0858f, 11.2498f, 14.75f, 11.5856f, 14.75f, 11.9998f)
                horizontalLineTo(16.25f)
                close()
                moveTo(7.0162f, 6.9579f)
                lineTo(7.1411f, 7.6974f)
                lineTo(7.0162f, 6.9579f)
                close()
                moveTo(8.5993f, 6.22f)
                lineTo(8.1865f, 5.5939f)
                lineTo(8.1865f, 5.5939f)
                lineTo(8.5993f, 6.22f)
                close()
                moveTo(7.728f, 6.7444f)
                lineTo(8.0308f, 7.4305f)
                lineTo(7.728f, 6.7444f)
                close()
                moveTo(3.3399f, 16.7225f)
                lineTo(3.025f, 17.4032f)
                lineTo(3.3399f, 16.7225f)
                close()
                moveTo(1.5348f, 13.0282f)
                lineTo(0.7862f, 13.0738f)
                lineTo(1.5348f, 13.0282f)
                close()
                moveTo(1.9585f, 15.4228f)
                lineTo(2.6188f, 15.067f)
                lineTo(1.9585f, 15.4228f)
                close()
                moveTo(13.7001f, 20.0747f)
                lineTo(13.4578f, 19.3649f)
                lineTo(13.7001f, 20.0747f)
                close()
                moveTo(15.4127f, 14.6052f)
                lineTo(16.1619f, 14.64f)
                lineTo(15.4127f, 14.6052f)
                close()
                moveTo(14.2797f, 19.7797f)
                lineTo(14.7109f, 20.3934f)
                lineTo(14.2797f, 19.7797f)
                close()
                moveTo(8.8182f, 6.0757f)
                lineTo(9.2311f, 6.7018f)
                lineTo(9.2311f, 6.7018f)
                lineTo(8.8182f, 6.0757f)
                close()
                moveTo(13.7001f, 3.9249f)
                lineTo(13.4578f, 4.6347f)
                lineTo(13.7001f, 3.9249f)
                close()
                moveTo(14.2797f, 4.2198f)
                lineTo(14.7109f, 3.6062f)
                lineTo(14.2797f, 4.2198f)
                close()
                moveTo(3.3399f, 7.2771f)
                lineTo(3.025f, 6.5964f)
                lineTo(3.3399f, 7.2771f)
                close()
                moveTo(1.5348f, 10.9714f)
                lineTo(0.7862f, 10.9258f)
                lineTo(1.5348f, 10.9714f)
                close()
                moveTo(1.9585f, 8.5768f)
                lineTo(2.6188f, 8.9325f)
                lineTo(1.9585f, 8.5768f)
                close()
                moveTo(9.9111f, 17.7452f)
                curveTo(9.5646f, 17.5182f, 9.0997f, 17.615f, 8.8727f, 17.9615f)
                curveTo(8.6457f, 18.3079f, 8.7425f, 18.7728f, 9.0889f, 18.9998f)
                lineTo(9.9111f, 17.7452f)
                close()
                moveTo(9.0122f, 6.8462f)
                lineTo(9.2311f, 6.7018f)
                lineTo(8.4054f, 5.4495f)
                lineTo(8.1865f, 5.5939f)
                lineTo(9.0122f, 6.8462f)
                close()
                moveTo(2.2834f, 12.9826f)
                curveTo(2.2622f, 12.6356f, 2.25f, 12.303f, 2.25f, 11.9998f)
                horizontalLineTo(0.75f)
                curveTo(0.75f, 12.3414f, 0.7637f, 12.7056f, 0.7862f, 13.0738f)
                lineTo(2.2834f, 12.9826f)
                close()
                moveTo(2.25f, 11.9998f)
                curveTo(2.25f, 11.6966f, 2.2622f, 11.364f, 2.2834f, 11.017f)
                lineTo(0.7862f, 10.9258f)
                curveTo(0.7637f, 11.294f, 0.75f, 11.6582f, 0.75f, 11.9998f)
                horizontalLineTo(2.25f)
                close()
                moveTo(14.75f, 11.9998f)
                curveTo(14.75f, 12.5116f, 14.7156f, 13.4508f, 14.6635f, 14.5704f)
                lineTo(16.1619f, 14.64f)
                curveTo(16.2137f, 13.525f, 16.25f, 12.5518f, 16.25f, 11.9998f)
                horizontalLineTo(14.75f)
                close()
                moveTo(6.0001f, 7.7498f)
                curveTo(6.4877f, 7.7498f, 6.8168f, 7.7522f, 7.1411f, 7.6974f)
                lineTo(6.8913f, 6.2184f)
                curveTo(6.7196f, 6.2474f, 6.5366f, 6.2498f, 6.0001f, 6.2498f)
                verticalLineTo(7.7498f)
                close()
                moveTo(8.1865f, 5.5939f)
                curveTo(7.7386f, 5.8892f, 7.5845f, 5.9879f, 7.4251f, 6.0582f)
                lineTo(8.0308f, 7.4305f)
                curveTo(8.3316f, 7.2977f, 8.6051f, 7.1146f, 9.0122f, 6.8462f)
                lineTo(8.1865f, 5.5939f)
                close()
                moveTo(7.1411f, 7.6974f)
                curveTo(7.4476f, 7.6457f, 7.7464f, 7.556f, 8.0308f, 7.4305f)
                lineTo(7.4251f, 6.0582f)
                curveTo(7.2545f, 6.1335f, 7.0752f, 6.1873f, 6.8913f, 6.2184f)
                lineTo(7.1411f, 7.6974f)
                close()
                moveTo(6.0001f, 17.7498f)
                curveTo(6.5366f, 17.7498f, 6.7196f, 17.7522f, 6.8913f, 17.7812f)
                lineTo(7.1411f, 16.3021f)
                curveTo(6.8168f, 16.2474f, 6.4877f, 16.2498f, 6.0001f, 16.2498f)
                verticalLineTo(17.7498f)
                close()
                moveTo(6.0001f, 16.2498f)
                curveTo(4.5564f, 16.2498f, 4.0691f, 16.2335f, 3.6548f, 16.0418f)
                lineTo(3.025f, 17.4032f)
                curveTo(3.8093f, 17.7661f, 4.6959f, 17.7498f, 6.0001f, 17.7498f)
                verticalLineTo(16.2498f)
                close()
                moveTo(0.7862f, 13.0738f)
                curveTo(0.8565f, 14.2273f, 0.8901f, 15.021f, 1.2983f, 15.7785f)
                lineTo(2.6188f, 15.067f)
                curveTo(2.4005f, 14.6619f, 2.3605f, 14.2467f, 2.2834f, 12.9826f)
                lineTo(0.7862f, 13.0738f)
                close()
                moveTo(3.6548f, 16.0418f)
                curveTo(3.2545f, 15.8566f, 2.828f, 15.4554f, 2.6188f, 15.067f)
                lineTo(1.2983f, 15.7785f)
                curveTo(1.6614f, 16.4525f, 2.3302f, 17.0817f, 3.025f, 17.4032f)
                lineTo(3.6548f, 16.0418f)
                close()
                moveTo(14.6635f, 14.5704f)
                curveTo(14.5924f, 16.1011f, 14.541f, 17.1731f, 14.4015f, 17.9479f)
                curveTo(14.2626f, 18.7193f, 14.0651f, 19.0139f, 13.8485f, 19.1661f)
                lineTo(14.7109f, 20.3934f)
                curveTo(15.417f, 19.8972f, 15.7159f, 19.1131f, 15.8778f, 18.2137f)
                curveTo(16.0391f, 17.3178f, 16.0928f, 16.1266f, 16.1619f, 14.64f)
                lineTo(14.6635f, 14.5704f)
                close()
                moveTo(13.9423f, 20.7845f)
                curveTo(14.2142f, 20.6917f, 14.4759f, 20.5585f, 14.7109f, 20.3934f)
                lineTo(13.8485f, 19.1661f)
                curveTo(13.7297f, 19.2496f, 13.5952f, 19.318f, 13.4578f, 19.3649f)
                lineTo(13.9423f, 20.7845f)
                close()
                moveTo(9.2311f, 6.7018f)
                curveTo(10.5209f, 5.8514f, 11.426f, 5.2565f, 12.1402f, 4.9095f)
                curveTo(12.8525f, 4.5635f, 13.2087f, 4.5497f, 13.4578f, 4.6347f)
                lineTo(13.9423f, 3.2151f)
                curveTo(13.1241f, 2.9359f, 12.3108f, 3.159f, 11.4848f, 3.5603f)
                curveTo(10.6607f, 3.9606f, 9.6586f, 4.6233f, 8.4054f, 5.4495f)
                lineTo(9.2311f, 6.7018f)
                close()
                moveTo(13.4578f, 4.6347f)
                curveTo(13.5952f, 4.6816f, 13.7297f, 4.75f, 13.8485f, 4.8335f)
                lineTo(14.7109f, 3.6062f)
                curveTo(14.4759f, 3.441f, 14.2142f, 3.3078f, 13.9423f, 3.2151f)
                lineTo(13.4578f, 4.6347f)
                close()
                moveTo(6.0001f, 6.2498f)
                curveTo(4.6959f, 6.2498f, 3.8093f, 6.2335f, 3.025f, 6.5964f)
                lineTo(3.6548f, 7.9577f)
                curveTo(4.0691f, 7.7661f, 4.5564f, 7.7498f, 6.0001f, 7.7498f)
                verticalLineTo(6.2498f)
                close()
                moveTo(2.2834f, 11.017f)
                curveTo(2.3605f, 9.7528f, 2.4005f, 9.3377f, 2.6188f, 8.9325f)
                lineTo(1.2983f, 8.221f)
                curveTo(0.8901f, 8.9786f, 0.8565f, 9.7723f, 0.7862f, 10.9258f)
                lineTo(2.2834f, 11.017f)
                close()
                moveTo(3.025f, 6.5964f)
                curveTo(2.3302f, 6.9179f, 1.6614f, 7.5471f, 1.2983f, 8.221f)
                lineTo(2.6188f, 8.9325f)
                curveTo(2.828f, 8.5442f, 3.2545f, 8.143f, 3.6548f, 7.9577f)
                lineTo(3.025f, 6.5964f)
                close()
                moveTo(9.0889f, 18.9998f)
                curveTo(10.1277f, 19.6806f, 10.9875f, 20.2245f, 11.7204f, 20.5488f)
                curveTo(12.4627f, 20.8771f, 13.2003f, 21.0377f, 13.9423f, 20.7845f)
                lineTo(13.4578f, 19.3649f)
                curveTo(13.2324f, 19.4418f, 12.9187f, 19.4386f, 12.3272f, 19.177f)
                curveTo(11.7264f, 18.9112f, 10.9698f, 18.439f, 9.9111f, 17.7452f)
                lineTo(9.0889f, 18.9998f)
                close()
                moveTo(16.1231f, 8.5398f)
                curveTo(16.0624f, 7.3126f, 15.9963f, 6.3068f, 15.827f, 5.5295f)
                curveTo(15.6552f, 4.7411f, 15.3503f, 4.0556f, 14.7109f, 3.6062f)
                lineTo(13.8485f, 4.8335f)
                curveTo(14.0443f, 4.9711f, 14.2254f, 5.2251f, 14.3614f, 5.8489f)
                curveTo(14.4997f, 6.4838f, 14.5631f, 7.363f, 14.6249f, 8.6138f)
                lineTo(16.1231f, 8.5398f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.0f, 18.0f)
                curveTo(20.0f, 18.0f, 21.5f, 16.2f, 21.5f, 12.0f)
                curveTo(21.5f, 9.5666f, 20.9965f, 7.9388f, 20.5729f, 7.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.0f, 15.0f)
                curveTo(18.0f, 15.0f, 18.5f, 14.1f, 18.5f, 12.0f)
                curveTo(18.5f, 11.1381f, 18.4158f, 10.4784f, 18.3165f, 10.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 2.0f)
                lineTo(2.0f, 22.0f)
            }
        }
            .build()
        return _volumeCross!!
    }

private var _volumeCross: ImageVector? = null
