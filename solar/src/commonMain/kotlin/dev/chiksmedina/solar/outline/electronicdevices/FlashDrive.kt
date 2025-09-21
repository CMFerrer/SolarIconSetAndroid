package dev.chiksmedina.solar.outline.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.ElectronicDevicesGroup

val ElectronicDevicesGroup.FlashDrive: ImageVector
    get() {
        if (_flashDrive != null) {
            return _flashDrive!!
        }
        _flashDrive = Builder(
            name = "FlashDrive", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(15.8923f, 3.1439f)
                curveTo(15.4676f, 3.4732f, 14.9659f, 3.9808f, 14.2276f, 4.7309f)
                lineTo(13.1673f, 5.8084f)
                curveTo(13.8946f, 6.379f, 14.7108f, 7.1953f, 15.7187f, 8.2031f)
                lineTo(15.797f, 8.2815f)
                curveTo(16.8486f, 9.3331f, 17.6917f, 10.1761f, 18.2647f, 10.9272f)
                curveTo(18.2698f, 10.9338f, 18.2748f, 10.9404f, 18.2798f, 10.9471f)
                lineTo(19.2956f, 9.9149f)
                curveTo(20.0337f, 9.1649f, 20.5333f, 8.6549f, 20.8578f, 8.2229f)
                curveTo(21.1688f, 7.8086f, 21.25f, 7.5533f, 21.25f, 7.3229f)
                curveTo(21.25f, 7.0925f, 21.1688f, 6.8372f, 20.8578f, 6.4229f)
                curveTo(20.5333f, 5.9908f, 20.0337f, 5.4808f, 19.2956f, 4.7309f)
                curveTo(18.5574f, 3.9808f, 18.0557f, 3.4732f, 17.6309f, 3.1439f)
                curveTo(17.223f, 2.8277f, 16.9774f, 2.75f, 16.7616f, 2.75f)
                curveTo(16.5459f, 2.75f, 16.3003f, 2.8277f, 15.8923f, 3.1439f)
                close()
                moveTo(19.0481f, 12.305f)
                lineTo(20.4015f, 10.9296f)
                curveTo(21.0935f, 10.2266f, 21.6653f, 9.6455f, 22.0573f, 9.1235f)
                curveTo(22.4695f, 8.5745f, 22.75f, 8.0058f, 22.75f, 7.3229f)
                curveTo(22.75f, 6.64f, 22.4695f, 6.0712f, 22.0573f, 5.5223f)
                curveTo(21.6653f, 5.0003f, 21.0935f, 4.4192f, 20.4015f, 3.7161f)
                lineTo(20.3276f, 3.641f)
                curveTo(19.636f, 2.9382f, 19.0641f, 2.357f, 18.55f, 1.9585f)
                curveTo(18.01f, 1.5398f, 17.4446f, 1.25f, 16.7616f, 1.25f)
                curveTo(16.0786f, 1.25f, 15.5132f, 1.5398f, 14.9732f, 1.9585f)
                curveTo(14.4592f, 2.357f, 13.8873f, 2.9382f, 13.1957f, 3.641f)
                lineTo(11.8487f, 5.0097f)
                curveTo(11.4614f, 4.8542f, 11.0589f, 4.7679f, 10.6247f, 4.7679f)
                curveTo(9.7207f, 4.7679f, 8.9541f, 5.142f, 8.1764f, 5.7354f)
                curveTo(7.4254f, 6.3084f, 6.5823f, 7.1515f, 5.5307f, 8.2031f)
                lineTo(4.6853f, 9.0485f)
                curveTo(3.6336f, 10.1002f, 2.7905f, 10.9433f, 2.2175f, 11.6943f)
                curveTo(1.6241f, 12.472f, 1.2501f, 13.2386f, 1.2501f, 14.1426f)
                curveTo(1.2501f, 15.0465f, 1.6241f, 15.8131f, 2.2175f, 16.5908f)
                curveTo(2.7905f, 17.3419f, 3.6336f, 18.1849f, 4.6853f, 19.2366f)
                lineTo(4.7635f, 19.3148f)
                curveTo(5.8152f, 20.3665f, 6.6582f, 21.2096f, 7.4093f, 21.7826f)
                curveTo(8.187f, 22.376f, 8.9536f, 22.75f, 9.8575f, 22.75f)
                curveTo(10.7615f, 22.75f, 11.5281f, 22.376f, 12.3058f, 21.7826f)
                curveTo(13.0568f, 21.2096f, 13.8999f, 20.3665f, 14.9515f, 19.3148f)
                lineTo(15.797f, 18.4694f)
                curveTo(16.8486f, 17.4178f, 17.6917f, 16.5747f, 18.2647f, 15.8236f)
                curveTo(18.8581f, 15.046f, 19.2321f, 14.2794f, 19.2321f, 13.3754f)
                curveTo(19.2321f, 12.9983f, 19.167f, 12.645f, 19.0481f, 12.305f)
                close()
                moveTo(11.5436f, 6.5205f)
                curveTo(11.201f, 6.3382f, 10.9116f, 6.2679f, 10.6247f, 6.2679f)
                curveTo(10.1805f, 6.2679f, 9.7306f, 6.4363f, 9.0863f, 6.9279f)
                curveTo(8.4248f, 7.4326f, 7.6521f, 8.2031f, 6.5522f, 9.3029f)
                lineTo(5.7851f, 10.0701f)
                curveTo(4.6852f, 11.17f, 3.9147f, 11.9427f, 3.41f, 12.6042f)
                curveTo(2.9185f, 13.2485f, 2.7501f, 13.6984f, 2.7501f, 14.1426f)
                curveTo(2.7501f, 14.5867f, 2.9185f, 15.0367f, 3.41f, 15.6809f)
                curveTo(3.9147f, 16.3425f, 4.6852f, 17.1151f, 5.7851f, 18.215f)
                curveTo(6.885f, 19.3149f, 7.6576f, 20.0853f, 8.3192f, 20.5901f)
                curveTo(8.9634f, 21.0816f, 9.4134f, 21.25f, 9.8575f, 21.25f)
                curveTo(10.3017f, 21.25f, 10.7516f, 21.0816f, 11.3959f, 20.5901f)
                curveTo(12.0574f, 20.0853f, 12.8301f, 19.3149f, 13.93f, 18.215f)
                lineTo(14.6971f, 17.4479f)
                curveTo(15.797f, 16.348f, 16.5675f, 15.5753f, 17.0722f, 14.9138f)
                curveTo(17.5638f, 14.2695f, 17.7321f, 13.8196f, 17.7321f, 13.3754f)
                curveTo(17.7321f, 12.9313f, 17.5638f, 12.4813f, 17.0722f, 11.8371f)
                curveTo(16.5675f, 11.1755f, 15.797f, 10.4028f, 14.6971f, 9.3029f)
                curveTo(13.5973f, 8.2031f, 12.8246f, 7.4326f, 12.163f, 6.9279f)
                curveTo(12.0041f, 6.8067f, 11.8571f, 6.7051f, 11.719f, 6.6209f)
                curveTo(11.6573f, 6.596f, 11.5982f, 6.5625f, 11.5436f, 6.5205f)
                close()
                moveTo(17.1266f, 4.7522f)
                curveTo(17.4194f, 5.0451f, 17.4194f, 5.5199f, 17.1266f, 5.8128f)
                lineTo(16.4194f, 6.5199f)
                curveTo(16.1266f, 6.8128f, 15.6517f, 6.8128f, 15.3588f, 6.5199f)
                curveTo(15.0659f, 6.227f, 15.0659f, 5.7522f, 15.3588f, 5.4593f)
                lineTo(16.0659f, 4.7522f)
                curveTo(16.3588f, 4.4593f, 16.8337f, 4.4593f, 17.1266f, 4.7522f)
                close()
                moveTo(19.2479f, 6.8735f)
                curveTo(19.5408f, 7.1664f, 19.5408f, 7.6412f, 19.2479f, 7.9341f)
                lineTo(18.5408f, 8.6412f)
                curveTo(18.2479f, 8.9341f, 17.773f, 8.9341f, 17.4801f, 8.6412f)
                curveTo(17.1872f, 8.3483f, 17.1872f, 7.8735f, 17.4801f, 7.5806f)
                lineTo(18.1872f, 6.8735f)
                curveTo(18.4801f, 6.5806f, 18.955f, 6.5806f, 19.2479f, 6.8735f)
                close()
                moveTo(4.7244f, 13.6122f)
                curveTo(5.0173f, 13.3193f, 5.4922f, 13.3193f, 5.7851f, 13.6122f)
                lineTo(10.3879f, 18.215f)
                curveTo(10.6808f, 18.5079f, 10.6808f, 18.9828f, 10.3879f, 19.2757f)
                curveTo(10.095f, 19.5686f, 9.6201f, 19.5686f, 9.3272f, 19.2757f)
                lineTo(4.7244f, 14.6729f)
                curveTo(4.4315f, 14.38f, 4.4315f, 13.9051f, 4.7244f, 13.6122f)
                close()
            }
        }
            .build()
        return _flashDrive!!
    }

private var _flashDrive: ImageVector? = null
