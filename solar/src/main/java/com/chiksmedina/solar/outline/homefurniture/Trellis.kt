package com.chiksmedina.solar.outline.homefurniture

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.HomeFurnitureGroup

val HomeFurnitureGroup.Trellis: ImageVector
    get() {
        if (_trellis != null) {
            return _trellis!!
        }
        _trellis = Builder(
            name = "Trellis", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.1988f, 2.9199f)
                curveTo(10.7812f, 3.049f, 10.2417f, 3.245f, 9.4877f, 3.5194f)
                curveTo(8.4217f, 3.9072f, 7.1677f, 4.2826f, 6.0679f, 4.3826f)
                curveTo(5.794f, 4.4075f, 5.597f, 4.4255f, 5.4517f, 4.4408f)
                curveTo(5.3795f, 4.4484f, 5.3255f, 4.4549f, 5.2848f, 4.4605f)
                curveTo(5.2647f, 4.4633f, 5.2496f, 4.4657f, 5.2385f, 4.4676f)
                lineTo(5.2261f, 4.4699f)
                curveTo(5.2232f, 4.4704f, 5.2219f, 4.4707f, 5.2219f, 4.4707f)
                curveTo(4.8878f, 4.547f, 4.6814f, 4.6751f, 4.5486f, 4.8206f)
                curveTo(4.4157f, 4.9661f, 4.3068f, 5.1832f, 4.2611f, 5.5228f)
                curveTo(4.2518f, 5.592f, 4.25f, 5.719f, 4.25f, 6.1375f)
                verticalLineTo(14.25f)
                horizontalLineTo(19.75f)
                verticalLineTo(6.1375f)
                curveTo(19.75f, 5.719f, 19.7481f, 5.592f, 19.7388f, 5.5228f)
                curveTo(19.6932f, 5.1832f, 19.5842f, 4.9661f, 19.4514f, 4.8206f)
                curveTo(19.3185f, 4.6751f, 19.1122f, 4.547f, 18.778f, 4.4707f)
                curveTo(18.7781f, 4.4707f, 18.7768f, 4.4704f, 18.7739f, 4.4699f)
                lineTo(18.7615f, 4.4676f)
                curveTo(18.7504f, 4.4657f, 18.7353f, 4.4633f, 18.7152f, 4.4605f)
                curveTo(18.6745f, 4.4549f, 18.6204f, 4.4484f, 18.5483f, 4.4408f)
                curveTo(18.403f, 4.4255f, 18.2059f, 4.4075f, 17.9321f, 4.3826f)
                curveTo(16.8322f, 4.2826f, 15.5782f, 3.9072f, 14.5122f, 3.5194f)
                curveTo(13.7582f, 3.245f, 13.2187f, 3.049f, 12.8012f, 2.9199f)
                curveTo(12.3773f, 2.7889f, 12.1472f, 2.7496f, 12.0f, 2.7496f)
                curveTo(11.8528f, 2.7496f, 11.6226f, 2.7889f, 11.1988f, 2.9199f)
                close()
                moveTo(21.25f, 14.2677f)
                verticalLineTo(6.1375f)
                curveTo(21.25f, 6.1152f, 21.25f, 6.0932f, 21.25f, 6.0717f)
                curveTo(21.2501f, 5.7477f, 21.2502f, 5.5068f, 21.2255f, 5.3229f)
                curveTo(21.148f, 4.7467f, 20.9388f, 4.2249f, 20.559f, 3.8091f)
                curveTo(20.1793f, 3.3932f, 19.6786f, 3.1377f, 19.1117f, 3.0083f)
                curveTo(18.9306f, 2.967f, 18.6175f, 2.9386f, 18.1676f, 2.8978f)
                curveTo(18.135f, 2.8949f, 18.1018f, 2.8919f, 18.0679f, 2.8888f)
                curveTo(17.1639f, 2.8066f, 16.0555f, 2.4846f, 15.0251f, 2.1098f)
                lineTo(15.0052f, 2.1025f)
                curveTo(14.2754f, 1.837f, 13.7012f, 1.6281f, 13.2441f, 1.4868f)
                curveTo(12.7891f, 1.3462f, 12.3816f, 1.2496f, 12.0f, 1.2496f)
                curveTo(11.6184f, 1.2496f, 11.2108f, 1.3462f, 10.7559f, 1.4868f)
                curveTo(10.2988f, 1.6281f, 9.7246f, 1.837f, 8.9948f, 2.1025f)
                lineTo(8.9749f, 2.1098f)
                curveTo(7.9445f, 2.4846f, 6.8361f, 2.8066f, 5.9321f, 2.8888f)
                curveTo(5.8981f, 2.8919f, 5.8649f, 2.8949f, 5.8324f, 2.8978f)
                curveTo(5.3824f, 2.9386f, 5.0694f, 2.967f, 4.8883f, 3.0083f)
                curveTo(4.3214f, 3.1377f, 3.8207f, 3.3932f, 3.4409f, 3.8091f)
                curveTo(3.0612f, 4.2249f, 2.852f, 4.7467f, 2.7745f, 5.323f)
                curveTo(2.7498f, 5.5068f, 2.7499f, 5.7477f, 2.75f, 6.0717f)
                curveTo(2.75f, 6.0932f, 2.75f, 6.1152f, 2.75f, 6.1375f)
                verticalLineTo(14.2677f)
                curveTo(1.9029f, 14.3891f, 1.2468f, 15.1179f, 1.2517f, 16.0042f)
                curveTo(1.2578f, 17.0857f, 1.2836f, 17.9871f, 1.4189f, 18.7236f)
                curveTo(1.5582f, 19.4816f, 1.8234f, 20.1267f, 2.3483f, 20.6516f)
                curveTo(2.8686f, 21.1719f, 3.5055f, 21.4359f, 4.25f, 21.5761f)
                verticalLineTo(22.0f)
                curveTo(4.25f, 22.4142f, 4.5858f, 22.75f, 5.0f, 22.75f)
                curveTo(5.4142f, 22.75f, 5.75f, 22.4142f, 5.75f, 22.0f)
                verticalLineTo(21.7243f)
                curveTo(6.3892f, 21.75f, 7.1188f, 21.75f, 7.9451f, 21.75f)
                horizontalLineTo(16.0549f)
                curveTo(16.8812f, 21.75f, 17.6107f, 21.75f, 18.25f, 21.7243f)
                verticalLineTo(22.0f)
                curveTo(18.25f, 22.4142f, 18.5858f, 22.75f, 19.0f, 22.75f)
                curveTo(19.4142f, 22.75f, 19.75f, 22.4142f, 19.75f, 22.0f)
                verticalLineTo(21.5761f)
                curveTo(20.4945f, 21.4359f, 21.1313f, 21.1719f, 21.6516f, 20.6516f)
                curveTo(22.1766f, 20.1267f, 22.4418f, 19.4816f, 22.581f, 18.7236f)
                curveTo(22.7163f, 17.9871f, 22.7422f, 17.0857f, 22.7482f, 16.0042f)
                curveTo(22.7532f, 15.1179f, 22.0971f, 14.3891f, 21.25f, 14.2677f)
                close()
                moveTo(12.75f, 20.25f)
                horizontalLineTo(16.0f)
                curveTo(17.4354f, 20.25f, 18.4365f, 20.2484f, 19.1919f, 20.1468f)
                curveTo(19.9256f, 20.0482f, 20.3142f, 19.8677f, 20.591f, 19.591f)
                curveTo(20.8344f, 19.3475f, 21.0016f, 19.0194f, 21.1057f, 18.4526f)
                curveTo(21.2138f, 17.8644f, 21.2422f, 17.0893f, 21.2483f, 15.9959f)
                curveTo(21.249f, 15.8631f, 21.1401f, 15.75f, 21.0f, 15.75f)
                horizontalLineTo(12.75f)
                verticalLineTo(20.25f)
                close()
                moveTo(11.25f, 15.75f)
                verticalLineTo(20.25f)
                horizontalLineTo(8.0f)
                curveTo(6.5646f, 20.25f, 5.5635f, 20.2484f, 4.8081f, 20.1468f)
                curveTo(4.0743f, 20.0482f, 3.6858f, 19.8677f, 3.409f, 19.591f)
                curveTo(3.1655f, 19.3475f, 2.9984f, 19.0194f, 2.8942f, 18.4526f)
                curveTo(2.7862f, 17.8644f, 2.7578f, 17.0893f, 2.7517f, 15.9959f)
                curveTo(2.751f, 15.8631f, 2.8599f, 15.75f, 3.0f, 15.75f)
                horizontalLineTo(11.25f)
                close()
                moveTo(11.0303f, 6.4696f)
                curveTo(11.3232f, 6.7625f, 11.3232f, 7.2374f, 11.0303f, 7.5303f)
                lineTo(10.0303f, 8.5303f)
                curveTo(9.7374f, 8.8232f, 9.2626f, 8.8232f, 8.9697f, 8.5303f)
                curveTo(8.6768f, 8.2374f, 8.6768f, 7.7625f, 8.9697f, 7.4696f)
                lineTo(9.9697f, 6.4696f)
                curveTo(10.2625f, 6.1767f, 10.7374f, 6.1767f, 11.0303f, 6.4696f)
                close()
                moveTo(14.0303f, 7.4696f)
                curveTo(14.3232f, 7.7625f, 14.3232f, 8.2374f, 14.0303f, 8.5303f)
                lineTo(11.0303f, 11.5303f)
                curveTo(10.7374f, 11.8232f, 10.2625f, 11.8232f, 9.9697f, 11.5303f)
                curveTo(9.6768f, 11.2374f, 9.6768f, 10.7625f, 9.9697f, 10.4696f)
                lineTo(12.9697f, 7.4696f)
                curveTo(13.2625f, 7.1767f, 13.7374f, 7.1767f, 14.0303f, 7.4696f)
                close()
                moveTo(15.0303f, 10.4696f)
                curveTo(15.3232f, 10.7625f, 15.3232f, 11.2374f, 15.0303f, 11.5303f)
                lineTo(14.0303f, 12.5303f)
                curveTo(13.7374f, 12.8232f, 13.2625f, 12.8232f, 12.9697f, 12.5303f)
                curveTo(12.6768f, 12.2374f, 12.6768f, 11.7625f, 12.9697f, 11.4696f)
                lineTo(13.9697f, 10.4696f)
                curveTo(14.2625f, 10.1767f, 14.7374f, 10.1767f, 15.0303f, 10.4696f)
                close()
                moveTo(6.25f, 18.0f)
                curveTo(6.25f, 17.5858f, 6.5858f, 17.25f, 7.0f, 17.25f)
                horizontalLineTo(9.0f)
                curveTo(9.4142f, 17.25f, 9.75f, 17.5858f, 9.75f, 18.0f)
                curveTo(9.75f, 18.4142f, 9.4142f, 18.75f, 9.0f, 18.75f)
                horizontalLineTo(7.0f)
                curveTo(6.5858f, 18.75f, 6.25f, 18.4142f, 6.25f, 18.0f)
                close()
                moveTo(14.25f, 18.0f)
                curveTo(14.25f, 17.5858f, 14.5858f, 17.25f, 15.0f, 17.25f)
                horizontalLineTo(17.0f)
                curveTo(17.4142f, 17.25f, 17.75f, 17.5858f, 17.75f, 18.0f)
                curveTo(17.75f, 18.4142f, 17.4142f, 18.75f, 17.0f, 18.75f)
                horizontalLineTo(15.0f)
                curveTo(14.5858f, 18.75f, 14.25f, 18.4142f, 14.25f, 18.0f)
                close()
            }
        }
            .build()
        return _trellis!!
    }

private var _trellis: ImageVector? = null
