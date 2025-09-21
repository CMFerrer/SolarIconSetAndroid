package dev.chiksmedina.solar.boldduotone.electronicdevices

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
import dev.chiksmedina.solar.boldduotone.ElectronicDevicesGroup

val ElectronicDevicesGroup.SmartSpeaker: ImageVector
    get() {
        if (_smartSpeaker != null) {
            return _smartSpeaker!!
        }
        _smartSpeaker = Builder(
            name = "SmartSpeaker", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.4614f, 15.6261f)
                curveTo(10.2165f, 15.7046f, 11.0596f, 15.7501f, 12.0001f, 15.7501f)
                curveTo(12.9436f, 15.7501f, 13.7867f, 15.7049f, 14.5394f, 15.6272f)
                curveTo(14.3253f, 15.2008f, 14.0738f, 14.9079f, 13.7895f, 14.7057f)
                curveTo(13.3846f, 14.4176f, 12.8244f, 14.25f, 12.0001f, 14.25f)
                curveTo(11.1758f, 14.25f, 10.6156f, 14.4176f, 10.2107f, 14.7057f)
                curveTo(9.9267f, 14.9078f, 9.6754f, 15.2002f, 9.4614f, 15.6261f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(3.321f, 6.6582f)
                curveTo(3.5622f, 4.5537f, 5.1512f, 2.8518f, 7.2393f, 2.4614f)
                lineTo(7.4544f, 2.4212f)
                curveTo(10.4585f, 1.8596f, 13.541f, 1.8596f, 16.5451f, 2.4212f)
                lineTo(16.8681f, 2.4816f)
                curveTo(18.8934f, 2.8602f, 20.4367f, 4.5076f, 20.6774f, 6.5481f)
                curveTo(20.9299f, 8.6876f, 21.0342f, 10.8401f, 20.9902f, 12.9906f)
                lineTo(20.4926f, 13.4479f)
                curveTo(20.195f, 13.7214f, 19.5597f, 14.2847f, 18.2763f, 14.7871f)
                curveTo(17.694f, 15.0151f, 16.972f, 15.2329f, 16.0807f, 15.4035f)
                curveTo(15.76f, 14.5968f, 15.305f, 13.943f, 14.6591f, 13.4835f)
                curveTo(13.9212f, 12.9585f, 13.0225f, 12.75f, 12.0001f, 12.75f)
                curveTo(10.9777f, 12.75f, 10.0791f, 12.9585f, 9.3412f, 13.4835f)
                curveTo(8.6958f, 13.9426f, 8.2411f, 14.5957f, 7.9203f, 15.4014f)
                curveTo(5.1302f, 14.8664f, 3.9293f, 13.865f, 3.4929f, 13.4845f)
                lineTo(3.0091f, 13.0627f)
                curveTo(2.9679f, 10.9709f, 3.0667f, 8.8771f, 3.3053f, 6.7952f)
                lineTo(3.321f, 6.6582f)
                close()
                moveTo(8.489f, 4.9798f)
                curveTo(8.8031f, 4.7098f, 8.8387f, 4.2362f, 8.5687f, 3.9222f)
                curveTo(8.2986f, 3.6081f, 7.8251f, 3.5724f, 7.511f, 3.8425f)
                curveTo(7.044f, 4.244f, 6.75f, 4.8419f, 6.75f, 5.4111f)
                curveTo(6.75f, 6.4248f, 7.517f, 7.1217f, 8.4031f, 7.526f)
                curveTo(9.3139f, 7.9416f, 10.5556f, 8.1611f, 12.0f, 8.1611f)
                curveTo(13.4444f, 8.1611f, 14.6861f, 7.9416f, 15.5969f, 7.526f)
                curveTo(16.483f, 7.1217f, 17.25f, 6.4248f, 17.25f, 5.4111f)
                curveTo(17.25f, 4.7876f, 16.9047f, 4.2885f, 16.489f, 3.931f)
                curveTo(16.1749f, 3.6609f, 15.7014f, 3.6966f, 15.4313f, 4.0107f)
                curveTo(15.1613f, 4.3248f, 15.1969f, 4.7983f, 15.511f, 5.0684f)
                curveTo(15.7359f, 5.2617f, 15.75f, 5.3811f, 15.75f, 5.4111f)
                curveTo(15.75f, 5.5509f, 15.6478f, 5.854f, 14.9742f, 6.1614f)
                curveTo(14.3253f, 6.4574f, 13.317f, 6.6611f, 12.0f, 6.6611f)
                curveTo(10.683f, 6.6611f, 9.6747f, 6.4574f, 9.0258f, 6.1614f)
                curveTo(8.3522f, 5.854f, 8.25f, 5.5509f, 8.25f, 5.4111f)
                curveTo(8.25f, 5.3794f, 8.2606f, 5.3099f, 8.3044f, 5.2199f)
                curveTo(8.3468f, 5.1326f, 8.4102f, 5.0476f, 8.489f, 4.9798f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.8227f, 16.1837f)
                curveTo(19.7765f, 15.8103f, 20.4432f, 15.3985f, 20.9019f, 15.0566f)
                curveTo(20.8552f, 15.7787f, 20.7918f, 16.4999f, 20.7115f, 17.2197f)
                lineTo(20.6944f, 17.3738f)
                curveTo(20.4469f, 19.5949f, 18.7037f, 21.3568f, 16.4796f, 21.634f)
                lineTo(15.5734f, 21.747f)
                curveTo(15.0786f, 21.8086f, 14.8312f, 21.8395f, 14.584f, 21.8653f)
                curveTo(12.8656f, 22.0447f, 11.1331f, 22.0447f, 9.4146f, 21.8653f)
                curveTo(9.1675f, 21.8395f, 8.9201f, 21.8086f, 8.4253f, 21.747f)
                lineTo(7.4098f, 21.6204f)
                curveTo(5.2483f, 21.351f, 3.5522f, 19.6421f, 3.3049f, 17.4842f)
                curveTo(3.2132f, 16.6843f, 3.1422f, 15.8827f, 3.0918f, 15.0801f)
                curveTo(4.3098f, 15.9555f, 6.8626f, 17.25f, 11.9997f, 17.25f)
                curveTo(15.1501f, 17.25f, 17.3246f, 16.7702f, 18.8227f, 16.1837f)
                close()
            }
        }
            .build()
        return _smartSpeaker!!
    }

private var _smartSpeaker: ImageVector? = null
