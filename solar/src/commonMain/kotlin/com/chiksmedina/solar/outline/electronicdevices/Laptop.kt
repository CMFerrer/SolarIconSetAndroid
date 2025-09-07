package com.chiksmedina.solar.outline.electronicdevices

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
import com.chiksmedina.solar.outline.ElectronicDevicesGroup

val ElectronicDevicesGroup.Laptop: ImageVector
    get() {
        if (_laptop != null) {
            return _laptop!!
        }
        _laptop = Builder(
            name = "Laptop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.3009f, 3.25f)
                horizontalLineTo(15.699f)
                curveTo(16.5975f, 3.25f, 17.3467f, 3.2499f, 17.9415f, 3.3299f)
                curveTo(18.5693f, 3.4143f, 19.1361f, 3.6f, 19.5916f, 4.0555f)
                curveTo(20.047f, 4.5109f, 20.2327f, 5.0777f, 20.3171f, 5.7055f)
                curveTo(20.3971f, 6.3003f, 20.3971f, 7.0495f, 20.397f, 7.948f)
                verticalLineTo(15.232f)
                lineTo(21.9096f, 16.7932f)
                lineTo(21.9135f, 16.7969f)
                lineTo(21.9206f, 16.804f)
                lineTo(21.9284f, 16.812f)
                lineTo(21.934f, 16.8177f)
                lineTo(21.9439f, 16.8281f)
                lineTo(21.9545f, 16.8394f)
                lineTo(21.9588f, 16.844f)
                lineTo(21.9668f, 16.8529f)
                lineTo(21.9757f, 16.8631f)
                lineTo(21.9839f, 16.8728f)
                curveTo(21.9866f, 16.876f, 21.9908f, 16.8812f, 21.996f, 16.8878f)
                curveTo(22.3675f, 17.3187f, 22.6991f, 17.962f, 22.7444f, 18.6051f)
                lineTo(22.7448f, 18.6089f)
                curveTo(22.746f, 18.6193f, 22.7467f, 18.6277f, 22.747f, 18.6325f)
                lineTo(22.7479f, 18.6452f)
                lineTo(22.7486f, 18.6586f)
                lineTo(22.749f, 18.6706f)
                lineTo(22.7492f, 18.6769f)
                lineTo(22.7494f, 18.6925f)
                lineTo(22.7495f, 18.7067f)
                lineTo(22.7495f, 18.7148f)
                lineTo(22.7494f, 18.7259f)
                lineTo(22.7492f, 18.7359f)
                lineTo(22.7491f, 18.7407f)
                curveTo(22.7491f, 18.7512f, 22.7491f, 18.7624f, 22.7491f, 18.7739f)
                curveTo(22.7493f, 18.9047f, 22.7496f, 19.0929f, 22.7445f, 19.1734f)
                curveTo(22.6572f, 20.5556f, 21.5556f, 21.6572f, 20.1734f, 21.7445f)
                curveTo(20.0862f, 21.75f, 19.989f, 21.75f, 19.8628f, 21.75f)
                horizontalLineTo(4.1371f)
                curveTo(4.011f, 21.75f, 3.9138f, 21.75f, 3.8266f, 21.7445f)
                curveTo(2.4444f, 21.6572f, 1.3428f, 20.5556f, 1.2555f, 19.1734f)
                curveTo(1.2504f, 19.0935f, 1.2507f, 18.9069f, 1.2509f, 18.7764f)
                curveTo(1.2509f, 18.7639f, 1.2509f, 18.752f, 1.2509f, 18.7406f)
                lineTo(1.2508f, 18.7359f)
                lineTo(1.2506f, 18.7259f)
                lineTo(1.2506f, 18.7148f)
                lineTo(1.2506f, 18.7067f)
                lineTo(1.2507f, 18.6925f)
                lineTo(1.2509f, 18.6769f)
                lineTo(1.251f, 18.6706f)
                lineTo(1.2514f, 18.6586f)
                lineTo(1.2521f, 18.6452f)
                lineTo(1.253f, 18.6325f)
                curveTo(1.2534f, 18.6277f, 1.2541f, 18.6193f, 1.2552f, 18.6089f)
                lineTo(1.2556f, 18.6051f)
                curveTo(1.3009f, 17.9621f, 1.6324f, 17.3187f, 2.0039f, 16.8878f)
                curveTo(2.0091f, 16.8811f, 2.0134f, 16.8759f, 2.0161f, 16.8728f)
                lineTo(2.0243f, 16.8631f)
                lineTo(2.0331f, 16.8529f)
                lineTo(2.0412f, 16.844f)
                lineTo(2.0454f, 16.8394f)
                lineTo(2.0561f, 16.8281f)
                lineTo(2.0659f, 16.8177f)
                lineTo(2.0715f, 16.812f)
                lineTo(2.0793f, 16.804f)
                lineTo(2.0865f, 16.797f)
                lineTo(2.0903f, 16.7932f)
                lineTo(3.6029f, 15.232f)
                lineTo(3.6029f, 7.948f)
                curveTo(3.6029f, 7.0495f, 3.6029f, 6.3003f, 3.6828f, 5.7055f)
                curveTo(3.7672f, 5.0777f, 3.9529f, 4.5109f, 4.4084f, 4.0555f)
                curveTo(4.8638f, 3.6f, 5.4306f, 3.4143f, 6.0584f, 3.3299f)
                curveTo(6.6532f, 3.2499f, 7.4024f, 3.25f, 8.3009f, 3.25f)
                close()
                moveTo(4.6705f, 16.2857f)
                lineTo(3.1564f, 17.8485f)
                curveTo(2.9286f, 18.1025f, 2.7625f, 18.4752f, 2.751f, 18.7263f)
                curveTo(2.751f, 18.748f, 2.7509f, 18.7699f, 2.7509f, 18.7919f)
                curveTo(2.7509f, 18.8452f, 2.7508f, 18.899f, 2.751f, 18.9492f)
                curveTo(2.7511f, 18.9864f, 2.7513f, 19.0186f, 2.7517f, 19.0443f)
                curveTo(2.752f, 19.0641f, 2.7524f, 19.0746f, 2.7525f, 19.0782f)
                curveTo(2.7922f, 19.7064f, 3.2929f, 20.2078f, 3.9211f, 20.2475f)
                curveTo(3.9546f, 20.2496f, 4.0f, 20.25f, 4.1607f, 20.25f)
                horizontalLineTo(19.8393f)
                curveTo(19.9999f, 20.25f, 20.0454f, 20.2496f, 20.0788f, 20.2475f)
                curveTo(20.7071f, 20.2078f, 21.2078f, 19.7071f, 21.2475f, 19.0788f)
                curveTo(21.2473f, 19.0824f, 21.2478f, 19.0735f, 21.2482f, 19.0441f)
                curveTo(21.2486f, 19.0184f, 21.2489f, 18.9861f, 21.249f, 18.949f)
                curveTo(21.2492f, 18.8974f, 21.2492f, 18.8418f, 21.2491f, 18.787f)
                curveTo(21.2491f, 18.7666f, 21.2491f, 18.7463f, 21.2491f, 18.7263f)
                curveTo(21.2375f, 18.4753f, 21.0714f, 18.1025f, 20.8435f, 17.8485f)
                lineTo(19.3294f, 16.2857f)
                horizontalLineTo(4.6705f)
                close()
                moveTo(18.897f, 14.7857f)
                verticalLineTo(8.0f)
                curveTo(18.897f, 7.036f, 18.8954f, 6.3884f, 18.8305f, 5.9054f)
                curveTo(18.7685f, 5.4439f, 18.6612f, 5.2464f, 18.5309f, 5.1161f)
                curveTo(18.4006f, 4.9858f, 18.2031f, 4.8786f, 17.7416f, 4.8165f)
                curveTo(17.2586f, 4.7516f, 16.611f, 4.75f, 15.647f, 4.75f)
                horizontalLineTo(8.3529f)
                curveTo(7.3889f, 4.75f, 6.7413f, 4.7516f, 6.2583f, 4.8165f)
                curveTo(5.7968f, 4.8786f, 5.5993f, 4.9858f, 5.469f, 5.1161f)
                curveTo(5.3387f, 5.2464f, 5.2315f, 5.4439f, 5.1694f, 5.9054f)
                curveTo(5.1045f, 6.3884f, 5.1029f, 7.036f, 5.1029f, 8.0f)
                verticalLineTo(14.7857f)
                horizontalLineTo(18.897f)
                close()
                moveTo(21.6697f, 18.0238f)
                curveTo(21.6773f, 18.0214f, 21.6845f, 18.019f, 21.6913f, 18.0165f)
                curveTo(21.6941f, 18.0149f, 21.697f, 18.0133f, 21.6999f, 18.0116f)
                curveTo(21.6898f, 18.0158f, 21.6798f, 18.0199f, 21.6697f, 18.0238f)
                close()
                moveTo(21.7162f, 18.0259f)
                curveTo(21.7222f, 18.0229f, 21.728f, 18.0201f, 21.7336f, 18.0175f)
                curveTo(21.7362f, 18.0167f, 21.7389f, 18.016f, 21.7415f, 18.0153f)
                curveTo(21.7331f, 18.0188f, 21.7246f, 18.0223f, 21.7162f, 18.0259f)
                close()
                moveTo(2.284f, 18.0259f)
                curveTo(2.2782f, 18.023f, 2.2725f, 18.0202f, 2.267f, 18.0177f)
                curveTo(2.2645f, 18.017f, 2.2619f, 18.0163f, 2.2593f, 18.0156f)
                curveTo(2.2676f, 18.019f, 2.2758f, 18.0224f, 2.284f, 18.0259f)
                close()
                moveTo(2.3309f, 18.024f)
                curveTo(2.3206f, 18.02f, 2.3102f, 18.0158f, 2.2999f, 18.0115f)
                curveTo(2.3029f, 18.0132f, 2.3058f, 18.0149f, 2.3087f, 18.0165f)
                curveTo(2.3157f, 18.0191f, 2.3232f, 18.0216f, 2.3309f, 18.024f)
                close()
                moveTo(8.75f, 18.5f)
                curveTo(8.75f, 18.0858f, 9.0858f, 17.75f, 9.5f, 17.75f)
                horizontalLineTo(14.5f)
                curveTo(14.9142f, 17.75f, 15.25f, 18.0858f, 15.25f, 18.5f)
                curveTo(15.25f, 18.9142f, 14.9142f, 19.25f, 14.5f, 19.25f)
                horizontalLineTo(9.5f)
                curveTo(9.0858f, 19.25f, 8.75f, 18.9142f, 8.75f, 18.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.75f, 6.75f)
                curveTo(12.75f, 7.1642f, 12.4142f, 7.5f, 12.0f, 7.5f)
                curveTo(11.5858f, 7.5f, 11.25f, 7.1642f, 11.25f, 6.75f)
                curveTo(11.25f, 6.3358f, 11.5858f, 6.0f, 12.0f, 6.0f)
                curveTo(12.4142f, 6.0f, 12.75f, 6.3358f, 12.75f, 6.75f)
                close()
            }
        }
            .build()
        return _laptop!!
    }

private var _laptop: ImageVector? = null
