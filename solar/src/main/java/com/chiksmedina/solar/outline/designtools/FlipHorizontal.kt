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

public val DesignToolsGroup.FlipHorizontal: ImageVector
    get() {
        if (_flipHorizontal != null) {
            return _flipHorizontal!!
        }
        _flipHorizontal = Builder(name = "FlipHorizontal", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 1.25f)
                curveTo(12.4142f, 1.25f, 12.75f, 1.5858f, 12.75f, 2.0f)
                verticalLineTo(6.0f)
                curveTo(12.75f, 6.4142f, 12.4142f, 6.75f, 12.0f, 6.75f)
                curveTo(11.5858f, 6.75f, 11.25f, 6.4142f, 11.25f, 6.0f)
                verticalLineTo(2.0f)
                curveTo(11.25f, 1.5858f, 11.5858f, 1.25f, 12.0f, 1.25f)
                close()
                moveTo(5.5496f, 3.6137f)
                curveTo(5.5658f, 3.6253f, 5.5821f, 3.6369f, 5.5984f, 3.6486f)
                lineTo(7.2039f, 4.7954f)
                curveTo(7.4911f, 5.0005f, 7.7458f, 5.1824f, 7.9465f, 5.3551f)
                curveTo(8.1643f, 5.5425f, 8.3582f, 5.7513f, 8.5006f, 6.0281f)
                curveTo(8.6431f, 6.3049f, 8.7003f, 6.5841f, 8.7262f, 6.8701f)
                curveTo(8.75f, 7.1339f, 8.75f, 7.4468f, 8.75f, 7.7998f)
                verticalLineTo(16.2002f)
                curveTo(8.75f, 16.5532f, 8.75f, 16.8661f, 8.7262f, 17.1299f)
                curveTo(8.7003f, 17.4159f, 8.6431f, 17.6951f, 8.5006f, 17.9719f)
                curveTo(8.3582f, 18.2487f, 8.1643f, 18.4575f, 7.9465f, 18.6449f)
                curveTo(7.7458f, 18.8176f, 7.4911f, 18.9995f, 7.2039f, 19.2046f)
                lineTo(5.5496f, 20.3863f)
                curveTo(4.8988f, 20.8512f, 4.3423f, 21.2487f, 3.8788f, 21.4865f)
                curveTo(3.4061f, 21.729f, 2.8048f, 21.9245f, 2.1992f, 21.6129f)
                curveTo(1.5936f, 21.3012f, 1.4032f, 20.6983f, 1.3258f, 20.1727f)
                curveTo(1.2499f, 19.6573f, 1.25f, 18.9734f, 1.25f, 18.1736f)
                lineTo(1.25f, 5.8864f)
                curveTo(1.25f, 5.8663f, 1.25f, 5.8463f, 1.25f, 5.8264f)
                curveTo(1.25f, 5.0266f, 1.2499f, 4.3427f, 1.3258f, 3.8273f)
                curveTo(1.4032f, 3.3017f, 1.5936f, 2.6988f, 2.1992f, 2.3872f)
                curveTo(2.8048f, 2.0755f, 3.4061f, 2.271f, 3.8788f, 2.5135f)
                curveTo(4.3423f, 2.7513f, 4.8988f, 3.1488f, 5.5496f, 3.6137f)
                close()
                moveTo(2.8569f, 3.7287f)
                curveTo(2.8565f, 3.728f, 2.8604f, 3.7269f, 2.87f, 3.7272f)
                curveTo(2.8622f, 3.7295f, 2.8574f, 3.7293f, 2.8569f, 3.7287f)
                close()
                moveTo(2.8899f, 3.7293f)
                curveTo(2.9337f, 3.736f, 3.026f, 3.7618f, 3.1941f, 3.8481f)
                curveTo(3.5472f, 4.0292f, 4.0132f, 4.3597f, 4.7266f, 4.8692f)
                lineTo(6.3078f, 5.9987f)
                curveTo(6.6265f, 6.2263f, 6.825f, 6.369f, 6.9682f, 6.4921f)
                curveTo(7.0999f, 6.6055f, 7.1431f, 6.6682f, 7.1669f, 6.7145f)
                curveTo(7.1907f, 6.7607f, 7.2166f, 6.8323f, 7.2323f, 7.0054f)
                curveTo(7.2493f, 7.1934f, 7.25f, 7.4379f, 7.25f, 7.8296f)
                verticalLineTo(16.1704f)
                curveTo(7.25f, 16.5621f, 7.2493f, 16.8066f, 7.2323f, 16.9946f)
                curveTo(7.2166f, 17.1677f, 7.1907f, 17.2393f, 7.1669f, 17.2855f)
                curveTo(7.1431f, 17.3318f, 7.0999f, 17.3945f, 6.9682f, 17.5078f)
                curveTo(6.825f, 17.631f, 6.6265f, 17.7737f, 6.3078f, 18.0013f)
                lineTo(4.7266f, 19.1308f)
                curveTo(4.0132f, 19.6403f, 3.5472f, 19.9708f, 3.1941f, 20.1519f)
                curveTo(3.026f, 20.2382f, 2.9337f, 20.264f, 2.8899f, 20.2707f)
                curveTo(2.8699f, 20.2312f, 2.8373f, 20.1411f, 2.8098f, 19.9542f)
                curveTo(2.752f, 19.5615f, 2.75f, 18.9902f, 2.75f, 18.1136f)
                verticalLineTo(5.8864f)
                curveTo(2.75f, 5.0098f, 2.752f, 4.4385f, 2.8098f, 4.0458f)
                curveTo(2.8373f, 3.8589f, 2.8699f, 3.7688f, 2.8899f, 3.7293f)
                close()
                moveTo(2.8569f, 20.2713f)
                curveTo(2.8574f, 20.2707f, 2.8622f, 20.2705f, 2.87f, 20.2728f)
                curveTo(2.8604f, 20.2731f, 2.8565f, 20.272f, 2.8569f, 20.2713f)
                close()
                moveTo(2.8998f, 20.2881f)
                curveTo(2.9062f, 20.2932f, 2.9089f, 20.2972f, 2.9086f, 20.2979f)
                curveTo(2.9083f, 20.2987f, 2.9051f, 20.2961f, 2.8998f, 20.2881f)
                close()
                moveTo(2.8998f, 3.7119f)
                curveTo(2.9051f, 3.7039f, 2.9083f, 3.7013f, 2.9086f, 3.7021f)
                curveTo(2.9089f, 3.7028f, 2.9062f, 3.7068f, 2.8998f, 3.7119f)
                close()
                moveTo(20.8059f, 3.8481f)
                curveTo(20.4528f, 4.0292f, 19.9868f, 4.3597f, 19.2735f, 4.8692f)
                lineTo(17.6922f, 5.9987f)
                curveTo(17.3735f, 6.2263f, 17.175f, 6.369f, 17.0318f, 6.4921f)
                curveTo(16.9001f, 6.6055f, 16.8569f, 6.6682f, 16.8331f, 6.7145f)
                curveTo(16.8093f, 6.7607f, 16.7834f, 6.8323f, 16.7677f, 7.0054f)
                curveTo(16.7507f, 7.1934f, 16.75f, 7.4379f, 16.75f, 7.8296f)
                verticalLineTo(16.1704f)
                curveTo(16.75f, 16.5621f, 16.7507f, 16.8066f, 16.7677f, 16.9946f)
                curveTo(16.7834f, 17.1677f, 16.8093f, 17.2393f, 16.8331f, 17.2855f)
                curveTo(16.8569f, 17.3318f, 16.9001f, 17.3945f, 17.0318f, 17.5078f)
                curveTo(17.175f, 17.631f, 17.3735f, 17.7737f, 17.6922f, 18.0013f)
                lineTo(19.2735f, 19.1308f)
                curveTo(19.9868f, 19.6403f, 20.4528f, 19.9708f, 20.8059f, 20.1519f)
                curveTo(20.974f, 20.2382f, 21.0663f, 20.264f, 21.1101f, 20.2707f)
                curveTo(21.1301f, 20.2312f, 21.1627f, 20.1411f, 21.1902f, 19.9542f)
                curveTo(21.248f, 19.5615f, 21.25f, 18.9902f, 21.25f, 18.1136f)
                verticalLineTo(5.8864f)
                curveTo(21.25f, 5.0098f, 21.248f, 4.4385f, 21.1902f, 4.0458f)
                curveTo(21.1627f, 3.8589f, 21.1301f, 3.7689f, 21.1101f, 3.7293f)
                curveTo(21.0663f, 3.736f, 20.974f, 3.7618f, 20.8059f, 3.8481f)
                close()
                moveTo(21.1431f, 3.7287f)
                curveTo(21.1426f, 3.7293f, 21.1378f, 3.7295f, 21.13f, 3.7272f)
                curveTo(21.1396f, 3.7269f, 21.1435f, 3.728f, 21.1431f, 3.7287f)
                close()
                moveTo(21.1002f, 3.7119f)
                curveTo(21.0938f, 3.7068f, 21.0911f, 3.7028f, 21.0914f, 3.7021f)
                curveTo(21.0917f, 3.7013f, 21.0949f, 3.7039f, 21.1002f, 3.7119f)
                close()
                moveTo(21.0914f, 20.2979f)
                curveTo(21.0911f, 20.2972f, 21.0938f, 20.2932f, 21.1002f, 20.2881f)
                curveTo(21.0949f, 20.2961f, 21.0917f, 20.2987f, 21.0914f, 20.2979f)
                close()
                moveTo(21.13f, 20.2728f)
                curveTo(21.1378f, 20.2705f, 21.1426f, 20.2707f, 21.1431f, 20.2713f)
                curveTo(21.1435f, 20.272f, 21.1396f, 20.2731f, 21.13f, 20.2728f)
                close()
                moveTo(20.1212f, 2.5135f)
                curveTo(20.5939f, 2.271f, 21.1952f, 2.0755f, 21.8008f, 2.3872f)
                curveTo(22.4064f, 2.6988f, 22.5968f, 3.3017f, 22.6742f, 3.8273f)
                curveTo(22.7501f, 4.3427f, 22.7501f, 5.0266f, 22.75f, 5.8263f)
                verticalLineTo(18.1737f)
                curveTo(22.7501f, 18.9734f, 22.7501f, 19.6573f, 22.6742f, 20.1727f)
                curveTo(22.5968f, 20.6983f, 22.4064f, 21.3012f, 21.8008f, 21.6129f)
                curveTo(21.1952f, 21.9245f, 20.5939f, 21.729f, 20.1212f, 21.4865f)
                curveTo(19.6577f, 21.2487f, 19.1012f, 20.8512f, 18.4505f, 20.3863f)
                lineTo(16.7961f, 19.2046f)
                curveTo(16.5089f, 18.9995f, 16.2542f, 18.8176f, 16.0535f, 18.6449f)
                curveTo(15.8358f, 18.4575f, 15.6418f, 18.2487f, 15.4994f, 17.9719f)
                curveTo(15.3569f, 17.6951f, 15.2997f, 17.4159f, 15.2738f, 17.1299f)
                curveTo(15.25f, 16.8661f, 15.25f, 16.5532f, 15.25f, 16.2002f)
                verticalLineTo(7.7998f)
                curveTo(15.25f, 7.4468f, 15.25f, 7.1339f, 15.2738f, 6.8701f)
                curveTo(15.2997f, 6.5841f, 15.3569f, 6.3049f, 15.4994f, 6.0281f)
                curveTo(15.6418f, 5.7513f, 15.8358f, 5.5425f, 16.0535f, 5.3551f)
                curveTo(16.2542f, 5.1824f, 16.5089f, 5.0005f, 16.7961f, 4.7954f)
                lineTo(18.4504f, 3.6137f)
                curveTo(19.1012f, 3.1488f, 19.6577f, 2.7513f, 20.1212f, 2.5135f)
                close()
                moveTo(12.0f, 9.25f)
                curveTo(12.4142f, 9.25f, 12.75f, 9.5858f, 12.75f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(12.75f, 14.4142f, 12.4142f, 14.75f, 12.0f, 14.75f)
                curveTo(11.5858f, 14.75f, 11.25f, 14.4142f, 11.25f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(11.25f, 9.5858f, 11.5858f, 9.25f, 12.0f, 9.25f)
                close()
                moveTo(12.0f, 17.25f)
                curveTo(12.4142f, 17.25f, 12.75f, 17.5858f, 12.75f, 18.0f)
                verticalLineTo(22.0f)
                curveTo(12.75f, 22.4142f, 12.4142f, 22.75f, 12.0f, 22.75f)
                curveTo(11.5858f, 22.75f, 11.25f, 22.4142f, 11.25f, 22.0f)
                verticalLineTo(18.0f)
                curveTo(11.25f, 17.5858f, 11.5858f, 17.25f, 12.0f, 17.25f)
                close()
            }
        }
        .build()
        return _flipHorizontal!!
    }

private var _flipHorizontal: ImageVector? = null