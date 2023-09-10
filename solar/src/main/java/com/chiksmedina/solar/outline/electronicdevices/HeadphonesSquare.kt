package com.chiksmedina.solar.outline.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.ElectronicDevicesGroup

val ElectronicDevicesGroup.HeadphonesSquare: ImageVector
    get() {
        if (_headphonesSquare != null) {
            return _headphonesSquare!!
        }
        _headphonesSquare = Builder(
            name = "HeadphonesSquare", defaultWidth = 24.0.dp, defaultHeight
            = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.9548f, 2.25f)
                horizontalLineTo(12.0452f)
                curveTo(13.8818f, 2.25f, 15.3214f, 2.25f, 16.4635f, 2.3737f)
                curveTo(17.6291f, 2.5f, 18.5734f, 2.7623f, 19.3798f, 3.3482f)
                curveTo(19.8679f, 3.7028f, 20.2972f, 4.1321f, 20.6518f, 4.6202f)
                curveTo(21.2377f, 5.4266f, 21.5f, 6.3709f, 21.6263f, 7.5365f)
                curveTo(21.75f, 8.6786f, 21.75f, 10.1182f, 21.75f, 11.9547f)
                verticalLineTo(14.7927f)
                curveTo(21.8282f, 14.765f, 21.9123f, 14.75f, 22.0f, 14.75f)
                curveTo(22.4142f, 14.75f, 22.75f, 15.0858f, 22.75f, 15.5f)
                verticalLineTo(17.5f)
                curveTo(22.75f, 17.9142f, 22.4142f, 18.25f, 22.0f, 18.25f)
                curveTo(21.9094f, 18.25f, 21.8225f, 18.2339f, 21.742f, 18.2045f)
                curveTo(21.7365f, 18.4049f, 21.7272f, 18.5895f, 21.7116f, 18.7587f)
                curveTo(21.6712f, 19.194f, 21.5841f, 19.5954f, 21.3689f, 19.9712f)
                curveTo(21.2257f, 20.2213f, 21.0455f, 20.448f, 20.8341f, 20.6429f)
                curveTo(20.5137f, 20.9382f, 20.1423f, 21.106f, 19.7312f, 21.2306f)
                curveTo(19.3426f, 21.3484f, 18.86f, 21.4436f, 18.2884f, 21.5563f)
                lineTo(18.2142f, 21.5709f)
                curveTo(17.8239f, 21.6479f, 17.4695f, 21.7178f, 17.1745f, 21.7411f)
                curveTo(16.8571f, 21.7661f, 16.4993f, 21.7486f, 16.1565f, 21.5557f)
                curveTo(15.9536f, 21.4415f, 15.7762f, 21.288f, 15.6334f, 21.1053f)
                curveTo(15.3961f, 20.8017f, 15.3167f, 20.4552f, 15.2824f, 20.1362f)
                curveTo(15.2499f, 19.8354f, 15.25f, 19.4644f, 15.25f, 19.0479f)
                verticalLineTo(13.8117f)
                curveTo(15.25f, 13.4578f, 15.25f, 13.1398f, 15.2754f, 12.8788f)
                curveTo(15.3025f, 12.6002f, 15.3647f, 12.2991f, 15.5481f, 12.0202f)
                curveTo(15.6991f, 11.7905f, 15.9016f, 11.5978f, 16.1411f, 11.4597f)
                curveTo(16.4362f, 11.2896f, 16.7438f, 11.252f, 17.0215f, 11.2501f)
                curveTo(17.2782f, 11.2483f, 17.5863f, 11.2787f, 17.9223f, 11.3119f)
                lineTo(17.9923f, 11.3188f)
                curveTo(18.578f, 11.3765f, 19.0707f, 11.4251f, 19.47f, 11.5042f)
                curveTo(19.7451f, 11.5587f, 20.0057f, 11.6327f, 20.25f, 11.7503f)
                curveTo(20.2497f, 9.988f, 20.2439f, 8.7031f, 20.135f, 7.6981f)
                curveTo(20.0225f, 6.6601f, 19.8074f, 6.0099f, 19.4383f, 5.5019f)
                curveTo(19.1762f, 5.1411f, 18.8589f, 4.8238f, 18.4981f, 4.5617f)
                curveTo(17.9901f, 4.1926f, 17.3399f, 3.9774f, 16.302f, 3.865f)
                curveTo(15.25f, 3.751f, 13.8916f, 3.75f, 12.0f, 3.75f)
                curveTo(10.1084f, 3.75f, 8.75f, 3.751f, 7.6981f, 3.865f)
                curveTo(6.6601f, 3.9774f, 6.0099f, 4.1926f, 5.5019f, 4.5617f)
                curveTo(5.1411f, 4.8238f, 4.8238f, 5.1411f, 4.5617f, 5.5019f)
                curveTo(4.1926f, 6.0099f, 3.9774f, 6.6601f, 3.865f, 7.6981f)
                curveTo(3.7561f, 8.7031f, 3.7503f, 9.988f, 3.75f, 11.7503f)
                curveTo(3.9943f, 11.6327f, 4.2549f, 11.5587f, 4.53f, 11.5042f)
                curveTo(4.9293f, 11.4251f, 5.422f, 11.3765f, 6.0077f, 11.3188f)
                lineTo(6.0777f, 11.3119f)
                curveTo(6.4137f, 11.2787f, 6.7218f, 11.2483f, 6.9785f, 11.2501f)
                curveTo(7.2562f, 11.252f, 7.5638f, 11.2896f, 7.8589f, 11.4597f)
                curveTo(8.0984f, 11.5978f, 8.3009f, 11.7905f, 8.4519f, 12.0202f)
                curveTo(8.6353f, 12.2991f, 8.6975f, 12.6002f, 8.7246f, 12.8788f)
                curveTo(8.75f, 13.1398f, 8.75f, 13.4578f, 8.75f, 13.8117f)
                verticalLineTo(19.0479f)
                curveTo(8.75f, 19.4644f, 8.7501f, 19.8354f, 8.7177f, 20.1362f)
                curveTo(8.6833f, 20.4552f, 8.6039f, 20.8017f, 8.3666f, 21.1053f)
                curveTo(8.2238f, 21.288f, 8.0464f, 21.4415f, 7.8435f, 21.5557f)
                curveTo(7.5007f, 21.7486f, 7.1429f, 21.7661f, 6.8255f, 21.7411f)
                curveTo(6.5306f, 21.7178f, 6.1761f, 21.6479f, 5.7858f, 21.5709f)
                lineTo(5.7116f, 21.5563f)
                curveTo(5.14f, 21.4436f, 4.6574f, 21.3484f, 4.2688f, 21.2306f)
                curveTo(3.8577f, 21.106f, 3.4863f, 20.9382f, 3.1659f, 20.6429f)
                curveTo(2.9545f, 20.448f, 2.7743f, 20.2213f, 2.6311f, 19.9712f)
                curveTo(2.4159f, 19.5954f, 2.3288f, 19.194f, 2.2885f, 18.7587f)
                curveTo(2.2728f, 18.5895f, 2.2635f, 18.4049f, 2.258f, 18.2045f)
                curveTo(2.1775f, 18.2339f, 2.0907f, 18.25f, 2.0f, 18.25f)
                curveTo(1.5858f, 18.25f, 1.25f, 17.9142f, 1.25f, 17.5f)
                verticalLineTo(15.5f)
                curveTo(1.25f, 15.0858f, 1.5858f, 14.75f, 2.0f, 14.75f)
                curveTo(2.0877f, 14.75f, 2.1718f, 14.765f, 2.25f, 14.7927f)
                lineTo(2.25f, 11.9547f)
                curveTo(2.25f, 10.1182f, 2.25f, 8.6786f, 2.3737f, 7.5365f)
                curveTo(2.5f, 6.3709f, 2.7623f, 5.4266f, 3.3482f, 4.6202f)
                curveTo(3.7028f, 4.1321f, 4.1321f, 3.7028f, 4.6202f, 3.3482f)
                curveTo(5.4266f, 2.7623f, 6.3709f, 2.5f, 7.5365f, 2.3737f)
                curveTo(8.6786f, 2.25f, 10.1182f, 2.25f, 11.9548f, 2.25f)
                close()
                moveTo(3.75f, 17.1933f)
                curveTo(3.75f, 17.8449f, 3.7508f, 18.2825f, 3.782f, 18.6203f)
                curveTo(3.8122f, 18.9456f, 3.8661f, 19.1093f, 3.9328f, 19.2259f)
                curveTo(4.0007f, 19.3444f, 4.0851f, 19.4502f, 4.1824f, 19.5398f)
                curveTo(4.2743f, 19.6245f, 4.4101f, 19.7061f, 4.704f, 19.7951f)
                curveTo(5.0124f, 19.8886f, 5.4207f, 19.97f, 6.0374f, 20.0916f)
                curveTo(6.479f, 20.1787f, 6.7463f, 20.2302f, 6.9433f, 20.2457f)
                curveTo(7.0496f, 20.2541f, 7.098f, 20.2481f, 7.1142f, 20.2448f)
                curveTo(7.1392f, 20.2297f, 7.1629f, 20.2092f, 7.1836f, 20.183f)
                curveTo(7.1898f, 20.1709f, 7.2108f, 20.1188f, 7.2263f, 19.9755f)
                curveTo(7.249f, 19.7649f, 7.25f, 19.476f, 7.25f, 19.0104f)
                verticalLineTo(13.8446f)
                curveTo(7.25f, 13.4474f, 7.2492f, 13.2036f, 7.2317f, 13.0241f)
                curveTo(7.2195f, 12.8988f, 7.2026f, 12.8534f, 7.198f, 12.8434f)
                curveTo(7.1746f, 12.8081f, 7.1457f, 12.7811f, 7.115f, 12.7623f)
                curveTo(7.1018f, 12.7588f, 7.0606f, 12.7507f, 6.9682f, 12.75f)
                curveTo(6.8004f, 12.7489f, 6.5724f, 12.7704f, 6.1905f, 12.808f)
                curveTo(5.5598f, 12.8702f, 5.1404f, 12.9124f, 4.8214f, 12.9756f)
                curveTo(4.5157f, 13.0362f, 4.3739f, 13.1037f, 4.2786f, 13.1755f)
                curveTo(4.1388f, 13.2808f, 4.0193f, 13.4167f, 3.9293f, 13.5759f)
                curveTo(3.8648f, 13.6899f, 3.8114f, 13.8541f, 3.7815f, 14.1848f)
                curveTo(3.7507f, 14.5264f, 3.75f, 14.9699f, 3.75f, 15.6276f)
                verticalLineTo(17.1933f)
                close()
                moveTo(20.25f, 15.6276f)
                curveTo(20.25f, 14.9699f, 20.2493f, 14.5264f, 20.2185f, 14.1848f)
                curveTo(20.1886f, 13.8541f, 20.1352f, 13.6899f, 20.0707f, 13.5759f)
                curveTo(19.9807f, 13.4167f, 19.8612f, 13.2808f, 19.7214f, 13.1755f)
                curveTo(19.6261f, 13.1037f, 19.4843f, 13.0362f, 19.1786f, 12.9756f)
                curveTo(18.8596f, 12.9124f, 18.4402f, 12.8702f, 17.8095f, 12.808f)
                curveTo(17.4276f, 12.7704f, 17.1996f, 12.7489f, 17.0318f, 12.75f)
                curveTo(16.9394f, 12.7507f, 16.8982f, 12.7588f, 16.885f, 12.7623f)
                curveTo(16.8543f, 12.7811f, 16.8254f, 12.8081f, 16.802f, 12.8434f)
                curveTo(16.7974f, 12.8534f, 16.7805f, 12.8988f, 16.7683f, 13.0241f)
                curveTo(16.7508f, 13.2036f, 16.75f, 13.4474f, 16.75f, 13.8446f)
                verticalLineTo(19.0104f)
                curveTo(16.75f, 19.476f, 16.751f, 19.7649f, 16.7737f, 19.9755f)
                curveTo(16.7892f, 20.1188f, 16.8102f, 20.1709f, 16.8164f, 20.183f)
                curveTo(16.8371f, 20.2092f, 16.8609f, 20.2297f, 16.8858f, 20.2448f)
                curveTo(16.902f, 20.2481f, 16.9504f, 20.2541f, 17.0567f, 20.2457f)
                curveTo(17.2538f, 20.2302f, 17.521f, 20.1787f, 17.9626f, 20.0916f)
                curveTo(18.5793f, 19.97f, 18.9876f, 19.8886f, 19.296f, 19.7951f)
                curveTo(19.5899f, 19.7061f, 19.7257f, 19.6245f, 19.8176f, 19.5398f)
                curveTo(19.9149f, 19.4502f, 19.9993f, 19.3444f, 20.0672f, 19.2259f)
                curveTo(20.1339f, 19.1093f, 20.1878f, 18.9456f, 20.218f, 18.6203f)
                curveTo(20.2493f, 18.2825f, 20.25f, 17.8449f, 20.25f, 17.1933f)
                verticalLineTo(15.6276f)
                close()
            }
        }
            .build()
        return _headphonesSquare!!
    }

private var _headphonesSquare: ImageVector? = null
