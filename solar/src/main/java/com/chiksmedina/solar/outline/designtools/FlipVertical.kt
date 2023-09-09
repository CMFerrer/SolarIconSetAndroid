package com.chiksmedina.solar.outline.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.DesignToolsGroup

public val DesignToolsGroup.FlipVertical: ImageVector
    get() {
        if (_flipVertical != null) {
            return _flipVertical!!
        }
        _flipVertical = Builder(name = "FlipVertical", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.8264f, 1.25f)
                curveTo(5.8463f, 1.25f, 5.8663f, 1.25f, 5.8864f, 1.25f)
                lineTo(18.1737f, 1.25f)
                curveTo(18.9734f, 1.25f, 19.6573f, 1.2499f, 20.1727f, 1.3258f)
                curveTo(20.6983f, 1.4032f, 21.3012f, 1.5936f, 21.6129f, 2.1992f)
                curveTo(21.9245f, 2.8048f, 21.729f, 3.4061f, 21.4865f, 3.8788f)
                curveTo(21.2487f, 4.3423f, 20.8512f, 4.8988f, 20.3863f, 5.5496f)
                lineTo(19.2046f, 7.2039f)
                curveTo(18.9995f, 7.4911f, 18.8176f, 7.7458f, 18.6449f, 7.9465f)
                curveTo(18.4575f, 8.1643f, 18.2487f, 8.3582f, 17.9719f, 8.5006f)
                curveTo(17.6951f, 8.6431f, 17.4159f, 8.7003f, 17.1299f, 8.7262f)
                curveTo(16.8661f, 8.75f, 16.5532f, 8.75f, 16.2002f, 8.75f)
                lineTo(7.7998f, 8.75f)
                curveTo(7.4468f, 8.75f, 7.1339f, 8.75f, 6.8701f, 8.7262f)
                curveTo(6.5841f, 8.7003f, 6.3049f, 8.6431f, 6.0281f, 8.5006f)
                curveTo(5.7513f, 8.3582f, 5.5425f, 8.1643f, 5.3551f, 7.9465f)
                curveTo(5.1824f, 7.7458f, 5.0005f, 7.4911f, 4.7954f, 7.2039f)
                lineTo(3.6486f, 5.5984f)
                curveTo(3.6369f, 5.5821f, 3.6253f, 5.5658f, 3.6137f, 5.5496f)
                curveTo(3.1488f, 4.8988f, 2.7513f, 4.3423f, 2.5135f, 3.8788f)
                curveTo(2.271f, 3.4061f, 2.0755f, 2.8048f, 2.3872f, 2.1992f)
                curveTo(2.6988f, 1.5936f, 3.3017f, 1.4032f, 3.8273f, 1.3258f)
                curveTo(4.3427f, 1.2499f, 5.0266f, 1.25f, 5.8264f, 1.25f)
                close()
                moveTo(3.7021f, 2.9086f)
                curveTo(3.7013f, 2.9083f, 3.7039f, 2.9051f, 3.7119f, 2.8998f)
                curveTo(3.7068f, 2.9062f, 3.7028f, 2.9089f, 3.7021f, 2.9086f)
                close()
                moveTo(3.7293f, 2.8899f)
                curveTo(3.7688f, 2.8699f, 3.8589f, 2.8373f, 4.0458f, 2.8098f)
                curveTo(4.4385f, 2.752f, 5.0098f, 2.75f, 5.8864f, 2.75f)
                lineTo(18.1136f, 2.75f)
                curveTo(18.9902f, 2.75f, 19.5615f, 2.752f, 19.9542f, 2.8098f)
                curveTo(20.1411f, 2.8373f, 20.2312f, 2.8699f, 20.2707f, 2.8899f)
                curveTo(20.264f, 2.9337f, 20.2382f, 3.026f, 20.1519f, 3.1941f)
                curveTo(19.9708f, 3.5472f, 19.6403f, 4.0132f, 19.1308f, 4.7266f)
                lineTo(18.0013f, 6.3078f)
                curveTo(17.7737f, 6.6265f, 17.631f, 6.825f, 17.5078f, 6.9682f)
                curveTo(17.3945f, 7.0999f, 17.3318f, 7.1431f, 17.2855f, 7.1669f)
                curveTo(17.2393f, 7.1907f, 17.1677f, 7.2166f, 16.9946f, 7.2323f)
                curveTo(16.8066f, 7.2493f, 16.5621f, 7.25f, 16.1704f, 7.25f)
                lineTo(7.8296f, 7.25f)
                curveTo(7.4379f, 7.25f, 7.1934f, 7.2493f, 7.0054f, 7.2323f)
                curveTo(6.8323f, 7.2166f, 6.7607f, 7.1907f, 6.7144f, 7.1669f)
                curveTo(6.6682f, 7.1431f, 6.6055f, 7.0999f, 6.4921f, 6.9682f)
                curveTo(6.369f, 6.825f, 6.2263f, 6.6265f, 5.9987f, 6.3078f)
                lineTo(4.8692f, 4.7266f)
                curveTo(4.3597f, 4.0132f, 4.0293f, 3.5472f, 3.8481f, 3.1941f)
                curveTo(3.7618f, 3.026f, 3.736f, 2.9337f, 3.7293f, 2.8899f)
                close()
                moveTo(20.2979f, 2.9086f)
                curveTo(20.2972f, 2.9089f, 20.2932f, 2.9062f, 20.2881f, 2.8998f)
                curveTo(20.2961f, 2.9051f, 20.2987f, 2.9083f, 20.2979f, 2.9086f)
                close()
                moveTo(20.2728f, 2.87f)
                curveTo(20.2705f, 2.8622f, 20.2707f, 2.8574f, 20.2713f, 2.8569f)
                curveTo(20.272f, 2.8565f, 20.2731f, 2.8604f, 20.2728f, 2.87f)
                close()
                moveTo(3.7272f, 2.87f)
                curveTo(3.7269f, 2.8604f, 3.728f, 2.8565f, 3.7287f, 2.8569f)
                curveTo(3.7293f, 2.8574f, 3.7295f, 2.8622f, 3.7272f, 2.87f)
                close()
                moveTo(1.25f, 12.0f)
                curveTo(1.25f, 11.5858f, 1.5858f, 11.25f, 2.0f, 11.25f)
                horizontalLineTo(6.0f)
                curveTo(6.4142f, 11.25f, 6.75f, 11.5858f, 6.75f, 12.0f)
                curveTo(6.75f, 12.4142f, 6.4142f, 12.75f, 6.0f, 12.75f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 12.75f, 1.25f, 12.4142f, 1.25f, 12.0f)
                close()
                moveTo(9.25f, 12.0f)
                curveTo(9.25f, 11.5858f, 9.5858f, 11.25f, 10.0f, 11.25f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 11.25f, 14.75f, 11.5858f, 14.75f, 12.0f)
                curveTo(14.75f, 12.4142f, 14.4142f, 12.75f, 14.0f, 12.75f)
                horizontalLineTo(10.0f)
                curveTo(9.5858f, 12.75f, 9.25f, 12.4142f, 9.25f, 12.0f)
                close()
                moveTo(17.25f, 12.0f)
                curveTo(17.25f, 11.5858f, 17.5858f, 11.25f, 18.0f, 11.25f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 11.25f, 22.75f, 11.5858f, 22.75f, 12.0f)
                curveTo(22.75f, 12.4142f, 22.4142f, 12.75f, 22.0f, 12.75f)
                horizontalLineTo(18.0f)
                curveTo(17.5858f, 12.75f, 17.25f, 12.4142f, 17.25f, 12.0f)
                close()
                moveTo(7.7998f, 15.25f)
                horizontalLineTo(16.2002f)
                curveTo(16.5532f, 15.25f, 16.8661f, 15.25f, 17.1299f, 15.2738f)
                curveTo(17.4159f, 15.2997f, 17.6951f, 15.3569f, 17.9719f, 15.4994f)
                curveTo(18.2487f, 15.6418f, 18.4575f, 15.8358f, 18.6449f, 16.0535f)
                curveTo(18.8176f, 16.2542f, 18.9995f, 16.5089f, 19.2046f, 16.7961f)
                lineTo(20.3863f, 18.4505f)
                curveTo(20.8512f, 19.1012f, 21.2487f, 19.6577f, 21.4865f, 20.1212f)
                curveTo(21.729f, 20.5939f, 21.9245f, 21.1952f, 21.6129f, 21.8008f)
                curveTo(21.3012f, 22.4064f, 20.6983f, 22.5968f, 20.1727f, 22.6742f)
                curveTo(19.6573f, 22.7501f, 18.9734f, 22.7501f, 18.1737f, 22.75f)
                horizontalLineTo(5.8263f)
                curveTo(5.0266f, 22.7501f, 4.3427f, 22.7501f, 3.8273f, 22.6742f)
                curveTo(3.3017f, 22.5968f, 2.6988f, 22.4064f, 2.3872f, 21.8008f)
                curveTo(2.0755f, 21.1952f, 2.271f, 20.5939f, 2.5135f, 20.1212f)
                curveTo(2.7513f, 19.6577f, 3.1488f, 19.1012f, 3.6137f, 18.4505f)
                lineTo(4.7781f, 16.8204f)
                lineTo(4.7954f, 16.7961f)
                curveTo(5.0005f, 16.5089f, 5.1824f, 16.2542f, 5.3551f, 16.0535f)
                curveTo(5.5425f, 15.8358f, 5.7513f, 15.6418f, 6.0281f, 15.4994f)
                curveTo(6.3049f, 15.3569f, 6.5841f, 15.2997f, 6.8701f, 15.2738f)
                curveTo(7.1339f, 15.25f, 7.4468f, 15.25f, 7.7998f, 15.25f)
                close()
                moveTo(7.0054f, 16.7677f)
                curveTo(6.8323f, 16.7834f, 6.7607f, 16.8093f, 6.7144f, 16.8331f)
                curveTo(6.6682f, 16.8569f, 6.6055f, 16.9001f, 6.4921f, 17.0318f)
                curveTo(6.369f, 17.175f, 6.2263f, 17.3735f, 5.9987f, 17.6922f)
                lineTo(4.8692f, 19.2735f)
                curveTo(4.3597f, 19.9868f, 4.0293f, 20.4528f, 3.8481f, 20.8059f)
                curveTo(3.7618f, 20.974f, 3.736f, 21.0663f, 3.7293f, 21.1101f)
                curveTo(3.7689f, 21.1301f, 3.8589f, 21.1627f, 4.0458f, 21.1902f)
                curveTo(4.4385f, 21.248f, 5.0098f, 21.25f, 5.8864f, 21.25f)
                horizontalLineTo(18.1136f)
                curveTo(18.9902f, 21.25f, 19.5615f, 21.248f, 19.9542f, 21.1902f)
                curveTo(20.1411f, 21.1627f, 20.2312f, 21.1301f, 20.2707f, 21.1101f)
                curveTo(20.264f, 21.0663f, 20.2382f, 20.974f, 20.1519f, 20.8059f)
                curveTo(19.9708f, 20.4528f, 19.6403f, 19.9868f, 19.1308f, 19.2735f)
                lineTo(18.0013f, 17.6922f)
                curveTo(17.7737f, 17.3735f, 17.631f, 17.175f, 17.5078f, 17.0318f)
                curveTo(17.3945f, 16.9001f, 17.3318f, 16.8569f, 17.2855f, 16.8331f)
                curveTo(17.2393f, 16.8093f, 17.1677f, 16.7834f, 16.9946f, 16.7677f)
                curveTo(16.8066f, 16.7507f, 16.5621f, 16.75f, 16.1704f, 16.75f)
                horizontalLineTo(7.8296f)
                curveTo(7.4379f, 16.75f, 7.1934f, 16.7507f, 7.0054f, 16.7677f)
                close()
                moveTo(20.2713f, 21.1431f)
                curveTo(20.2707f, 21.1426f, 20.2705f, 21.1378f, 20.2728f, 21.13f)
                curveTo(20.2731f, 21.1396f, 20.272f, 21.1435f, 20.2713f, 21.1431f)
                close()
                moveTo(20.2881f, 21.1002f)
                curveTo(20.2932f, 21.0938f, 20.2972f, 21.0911f, 20.2979f, 21.0914f)
                curveTo(20.2987f, 21.0917f, 20.2961f, 21.0949f, 20.2881f, 21.1002f)
                close()
                moveTo(3.7021f, 21.0914f)
                curveTo(3.7028f, 21.0911f, 3.7068f, 21.0938f, 3.7119f, 21.1002f)
                curveTo(3.7039f, 21.0949f, 3.7013f, 21.0917f, 3.7021f, 21.0914f)
                close()
                moveTo(3.7272f, 21.13f)
                curveTo(3.7295f, 21.1378f, 3.7293f, 21.1426f, 3.7287f, 21.1431f)
                curveTo(3.728f, 21.1435f, 3.7269f, 21.1396f, 3.7272f, 21.13f)
                close()
            }
        }
        .build()
        return _flipVertical!!
    }

private var _flipVertical: ImageVector? = null
