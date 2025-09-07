package com.chiksmedina.solar.bold.security

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
import com.chiksmedina.solar.bold.SecurityGroup

val SecurityGroup.ObjectScan: ImageVector
    get() {
        if (_objectScan != null) {
            return _objectScan!!
        }
        _objectScan = Builder(
            name = "ObjectScan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(22.0f, 13.25f)
                curveTo(22.4142f, 13.25f, 22.75f, 13.5858f, 22.75f, 14.0f)
                verticalLineTo(14.0564f)
                curveTo(22.75f, 15.8942f, 22.75f, 17.3498f, 22.5969f, 18.489f)
                curveTo(22.4392f, 19.6614f, 22.1071f, 20.6104f, 21.3588f, 21.3588f)
                curveTo(20.6104f, 22.1071f, 19.6614f, 22.4392f, 18.489f, 22.5969f)
                curveTo(17.3498f, 22.75f, 15.8942f, 22.75f, 14.0564f, 22.75f)
                horizontalLineTo(14.0f)
                curveTo(13.5858f, 22.75f, 13.25f, 22.4142f, 13.25f, 22.0f)
                curveTo(13.25f, 21.5858f, 13.5858f, 21.25f, 14.0f, 21.25f)
                curveTo(15.9068f, 21.25f, 17.2615f, 21.2484f, 18.2892f, 21.1102f)
                curveTo(19.2952f, 20.975f, 19.8749f, 20.7213f, 20.2981f, 20.2981f)
                curveTo(20.7213f, 19.8749f, 20.975f, 19.2952f, 21.1102f, 18.2892f)
                curveTo(21.2484f, 17.2615f, 21.25f, 15.9068f, 21.25f, 14.0f)
                curveTo(21.25f, 13.5858f, 21.5858f, 13.25f, 22.0f, 13.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(2.0f, 13.25f)
                curveTo(2.4142f, 13.25f, 2.75f, 13.5858f, 2.75f, 14.0f)
                curveTo(2.75f, 15.9068f, 2.7516f, 17.2615f, 2.8898f, 18.2892f)
                curveTo(3.025f, 19.2952f, 3.2787f, 19.8749f, 3.7019f, 20.2981f)
                curveTo(4.1251f, 20.7213f, 4.7048f, 20.975f, 5.7108f, 21.1102f)
                curveTo(6.7385f, 21.2484f, 8.0932f, 21.25f, 10.0f, 21.25f)
                curveTo(10.4142f, 21.25f, 10.75f, 21.5858f, 10.75f, 22.0f)
                curveTo(10.75f, 22.4142f, 10.4142f, 22.75f, 10.0f, 22.75f)
                horizontalLineTo(9.9436f)
                curveTo(8.1058f, 22.75f, 6.6502f, 22.75f, 5.511f, 22.5969f)
                curveTo(4.3386f, 22.4392f, 3.3896f, 22.1071f, 2.6412f, 21.3588f)
                curveTo(1.8929f, 20.6104f, 1.5608f, 19.6614f, 1.4031f, 18.489f)
                curveTo(1.25f, 17.3498f, 1.25f, 15.8942f, 1.25f, 14.0564f)
                curveTo(1.25f, 14.0377f, 1.25f, 14.0188f, 1.25f, 14.0f)
                curveTo(1.25f, 13.5858f, 1.5858f, 13.25f, 2.0f, 13.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.9436f, 1.25f)
                lineTo(10.0f, 1.25f)
                curveTo(10.4142f, 1.25f, 10.75f, 1.5858f, 10.75f, 2.0f)
                curveTo(10.75f, 2.4142f, 10.4142f, 2.75f, 10.0f, 2.75f)
                curveTo(8.0932f, 2.75f, 6.7385f, 2.7516f, 5.7108f, 2.8898f)
                curveTo(4.7048f, 3.025f, 4.1251f, 3.2787f, 3.7019f, 3.7019f)
                curveTo(3.2787f, 4.1251f, 3.025f, 4.7048f, 2.8898f, 5.7108f)
                curveTo(2.7516f, 6.7385f, 2.75f, 8.0932f, 2.75f, 10.0f)
                curveTo(2.75f, 10.4142f, 2.4142f, 10.75f, 2.0f, 10.75f)
                curveTo(1.5858f, 10.75f, 1.25f, 10.4142f, 1.25f, 10.0f)
                lineTo(1.25f, 9.9436f)
                curveTo(1.25f, 8.1058f, 1.25f, 6.6502f, 1.4031f, 5.511f)
                curveTo(1.5608f, 4.3386f, 1.8929f, 3.3896f, 2.6412f, 2.6412f)
                curveTo(3.3896f, 1.8929f, 4.3386f, 1.5608f, 5.511f, 1.4031f)
                curveTo(6.6502f, 1.25f, 8.1058f, 1.25f, 9.9436f, 1.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(18.2892f, 2.8898f)
                curveTo(17.2615f, 2.7516f, 15.9068f, 2.75f, 14.0f, 2.75f)
                curveTo(13.5858f, 2.75f, 13.25f, 2.4142f, 13.25f, 2.0f)
                curveTo(13.25f, 1.5858f, 13.5858f, 1.25f, 14.0f, 1.25f)
                curveTo(14.0188f, 1.25f, 14.0377f, 1.25f, 14.0564f, 1.25f)
                curveTo(15.8942f, 1.25f, 17.3498f, 1.25f, 18.489f, 1.4031f)
                curveTo(19.6614f, 1.5608f, 20.6104f, 1.8929f, 21.3588f, 2.6412f)
                curveTo(22.1071f, 3.3896f, 22.4392f, 4.3386f, 22.5969f, 5.511f)
                curveTo(22.75f, 6.6502f, 22.75f, 8.1058f, 22.75f, 9.9436f)
                verticalLineTo(10.0f)
                curveTo(22.75f, 10.4142f, 22.4142f, 10.75f, 22.0f, 10.75f)
                curveTo(21.5858f, 10.75f, 21.25f, 10.4142f, 21.25f, 10.0f)
                curveTo(21.25f, 8.0932f, 21.2484f, 6.7385f, 21.1102f, 5.7108f)
                curveTo(20.975f, 4.7048f, 20.7213f, 4.1251f, 20.2981f, 3.7019f)
                curveTo(19.8749f, 3.2787f, 19.2952f, 3.025f, 18.2892f, 2.8898f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(6.0247f, 13.1088f)
                curveTo(6.7759f, 12.746f, 8.443f, 11.5f, 12.0005f, 11.5f)
                curveTo(15.5579f, 11.5f, 17.2246f, 12.746f, 17.9758f, 13.1088f)
                curveTo(17.9796f, 13.1106f, 17.9838f, 13.1126f, 17.9883f, 13.1148f)
                curveTo(18.0426f, 13.1408f, 18.1502f, 13.1924f, 18.2508f, 13.266f)
                curveTo(18.383f, 13.363f, 18.48f, 13.4769f, 18.5591f, 13.6028f)
                curveTo(18.7531f, 13.9121f, 18.7514f, 14.2065f, 18.7504f, 14.3804f)
                curveTo(18.7504f, 14.3922f, 18.7503f, 14.4035f, 18.7503f, 14.4142f)
                lineTo(18.7503f, 14.552f)
                curveTo(18.7503f, 15.4505f, 18.7503f, 16.1997f, 18.6704f, 16.7945f)
                curveTo(18.586f, 17.4223f, 18.4003f, 17.9891f, 17.9448f, 18.4445f)
                curveTo(17.4894f, 18.9f, 16.9226f, 19.0857f, 16.2948f, 19.1701f)
                curveTo(15.7f, 19.2501f, 14.9508f, 19.25f, 14.0523f, 19.25f)
                horizontalLineTo(9.9483f)
                curveTo(9.0498f, 19.25f, 8.3006f, 19.2501f, 7.7058f, 19.1701f)
                curveTo(7.078f, 19.0857f, 6.5112f, 18.9f, 6.0557f, 18.4445f)
                curveTo(5.6003f, 17.9891f, 5.4146f, 17.4223f, 5.3302f, 16.7945f)
                curveTo(5.2502f, 16.1997f, 5.2503f, 15.4505f, 5.2503f, 14.552f)
                curveTo(5.2503f, 14.5347f, 5.2503f, 14.5174f, 5.2503f, 14.5f)
                verticalLineTo(14.4142f)
                curveTo(5.2503f, 14.4035f, 5.2502f, 14.3922f, 5.2502f, 14.3804f)
                curveTo(5.2491f, 14.2065f, 5.2474f, 13.9121f, 5.4415f, 13.6028f)
                curveTo(5.5205f, 13.4769f, 5.6175f, 13.363f, 5.7498f, 13.266f)
                curveTo(5.8504f, 13.1924f, 5.958f, 13.1408f, 6.0123f, 13.1148f)
                curveTo(6.0168f, 13.1126f, 6.021f, 13.1106f, 6.0247f, 13.1088f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.2945f, 4.8299f)
                curveTo(15.6997f, 4.7499f, 14.9505f, 4.75f, 14.052f, 4.75f)
                horizontalLineTo(9.948f)
                curveTo(9.0495f, 4.75f, 8.3003f, 4.7499f, 7.7055f, 4.8299f)
                curveTo(7.0777f, 4.9143f, 6.5109f, 5.1f, 6.0555f, 5.5555f)
                curveTo(5.6f, 6.0109f, 5.4143f, 6.5777f, 5.3299f, 7.2055f)
                curveTo(5.2499f, 7.8003f, 5.25f, 8.5495f, 5.25f, 9.448f)
                lineTo(5.25f, 9.7338f)
                curveTo(5.0562f, 9.8578f, 4.8912f, 9.9747f, 4.7541f, 10.0788f)
                curveTo(4.5944f, 10.2f, 4.4728f, 10.3037f, 4.3876f, 10.3806f)
                curveTo(4.3451f, 10.4191f, 4.3116f, 10.4509f, 4.2871f, 10.4749f)
                curveTo(4.2749f, 10.4869f, 4.2649f, 10.4969f, 4.2571f, 10.5048f)
                lineTo(4.247f, 10.5151f)
                lineTo(4.2432f, 10.5191f)
                lineTo(4.2417f, 10.5207f)
                lineTo(4.2403f, 10.5222f)
                curveTo(3.9306f, 10.8486f, 3.9187f, 11.3912f, 4.2136f, 11.734f)
                curveTo(4.5072f, 12.0754f, 4.9944f, 12.0899f, 5.3042f, 11.7676f)
                lineTo(5.3124f, 11.7595f)
                curveTo(5.3222f, 11.75f, 5.3402f, 11.7327f, 5.3668f, 11.7086f)
                curveTo(5.42f, 11.6606f, 5.5072f, 11.5857f, 5.6298f, 11.4926f)
                curveTo(5.8749f, 11.3066f, 6.2618f, 11.0475f, 6.8019f, 10.7847f)
                curveTo(7.8793f, 10.2603f, 9.5798f, 9.7143f, 12.0f, 9.7143f)
                curveTo(14.4202f, 9.7143f, 16.1207f, 10.2603f, 17.1981f, 10.7847f)
                curveTo(17.7382f, 11.0475f, 18.1251f, 11.3066f, 18.3702f, 11.4926f)
                curveTo(18.4928f, 11.5857f, 18.58f, 11.6606f, 18.6332f, 11.7086f)
                curveTo(18.6598f, 11.7327f, 18.6779f, 11.75f, 18.6876f, 11.7595f)
                lineTo(18.6958f, 11.7676f)
                curveTo(19.0056f, 12.0899f, 19.4928f, 12.0754f, 19.7864f, 11.734f)
                curveTo(20.0813f, 11.3912f, 20.0694f, 10.8486f, 19.7597f, 10.5222f)
                lineTo(19.7129f, 10.4749f)
                curveTo(19.6884f, 10.4509f, 19.6549f, 10.4191f, 19.6124f, 10.3806f)
                curveTo(19.5272f, 10.3037f, 19.4056f, 10.2f, 19.2459f, 10.0788f)
                curveTo(19.1088f, 9.9747f, 18.9438f, 9.8578f, 18.75f, 9.7338f)
                lineTo(18.75f, 9.448f)
                curveTo(18.75f, 8.5495f, 18.7501f, 7.8003f, 18.6701f, 7.2055f)
                curveTo(18.5857f, 6.5777f, 18.4f, 6.0109f, 17.9445f, 5.5555f)
                curveTo(17.4891f, 5.1f, 16.9223f, 4.9143f, 16.2945f, 4.8299f)
                close()
            }
        }
            .build()
        return _objectScan!!
    }

private var _objectScan: ImageVector? = null
