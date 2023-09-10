package com.chiksmedina.solar.linear.hands

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
import com.chiksmedina.solar.linear.HandsGroup

val HandsGroup.HandShake: ImageVector
    get() {
        if (_handShake != null) {
            return _handShake!!
        }
        _handShake = Builder(
            name = "HandShake", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.7836f, 21.9999f)
                curveTo(7.0984f, 21.2478f, 5.7064f, 20.0758f, 4.7915f, 18.5068f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.8252f, 2.186f)
                curveTo(16.5021f, 1.7088f, 18.2333f, 2.163f, 19.4417f, 3.3972f)
            }
            path(
                fill = SolidColor(Color(0xFF1C274C)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(4.0106f, 8.3666f)
                lineTo(3.6385f, 7.7154f)
                lineTo(4.0106f, 8.3666f)
                close()
                moveTo(6.5022f, 8.8674f)
                lineTo(7.1501f, 8.4896f)
                lineTo(6.5022f, 8.8674f)
                close()
                moveTo(3.2028f, 10.7531f)
                lineTo(2.5549f, 11.1309f)
                horizontalLineTo(2.5549f)
                lineTo(3.2028f, 10.7531f)
                close()
                moveTo(7.6968f, 3.3725f)
                lineTo(8.3447f, 2.9947f)
                verticalLineTo(2.9947f)
                lineTo(7.6968f, 3.3725f)
                close()
                moveTo(8.5387f, 4.8162f)
                lineTo(7.8909f, 5.194f)
                lineTo(8.5387f, 4.8162f)
                close()
                moveTo(10.4165f, 9.5252f)
                curveTo(10.6252f, 9.883f, 11.0844f, 10.0039f, 11.4422f, 9.7952f)
                curveTo(11.8f, 9.5866f, 11.9209f, 9.1274f, 11.7123f, 8.7696f)
                lineTo(10.4165f, 9.5252f)
                close()
                moveTo(7.5381f, 12.1327f)
                curveTo(7.7467f, 12.4905f, 8.2059f, 12.6114f, 8.5638f, 12.4027f)
                curveTo(8.9216f, 12.1941f, 9.0425f, 11.7349f, 8.8338f, 11.377f)
                lineTo(7.5381f, 12.1327f)
                close()
                moveTo(4.3975f, 5.2582f)
                lineTo(3.7496f, 5.636f)
                lineTo(4.3975f, 5.2582f)
                close()
                moveTo(11.8381f, 2.9306f)
                lineTo(12.486f, 2.5528f)
                verticalLineTo(2.5528f)
                lineTo(11.8381f, 2.9306f)
                close()
                moveTo(14.3638f, 7.2617f)
                lineTo(15.0117f, 6.8839f)
                lineTo(14.3638f, 7.2617f)
                close()
                moveTo(16.0475f, 10.1491f)
                lineTo(16.4197f, 10.8003f)
                curveTo(16.5934f, 10.701f, 16.7202f, 10.5365f, 16.772f, 10.3433f)
                curveTo(16.8238f, 10.15f, 16.7962f, 9.9441f, 16.6954f, 9.7713f)
                lineTo(16.0475f, 10.1491f)
                close()
                moveTo(17.6632f, 5.3761f)
                lineTo(17.0153f, 5.7539f)
                lineTo(17.6632f, 5.3761f)
                close()
                moveTo(20.1888f, 9.7072f)
                lineTo(20.8367f, 9.3294f)
                verticalLineTo(9.3294f)
                lineTo(20.1888f, 9.7072f)
                close()
                moveTo(6.9913f, 17.2497f)
                lineTo(7.6392f, 16.8719f)
                lineTo(6.9913f, 17.2497f)
                close()
                moveTo(16.9576f, 19.2533f)
                lineTo(16.5854f, 18.6021f)
                lineTo(16.9576f, 19.2533f)
                close()
                moveTo(13.784f, 15.3f)
                curveTo(13.9927f, 15.6578f, 14.4519f, 15.7787f, 14.8097f, 15.5701f)
                curveTo(15.1676f, 15.3614f, 15.2885f, 14.9022f, 15.0798f, 14.5444f)
                lineTo(13.784f, 15.3f)
                close()
                moveTo(4.3828f, 9.0177f)
                curveTo(5.0164f, 8.6556f, 5.6402f, 8.8782f, 5.8543f, 9.2452f)
                lineTo(7.1501f, 8.4896f)
                curveTo(6.4342f, 7.262f, 4.827f, 7.0361f, 3.6385f, 7.7154f)
                lineTo(4.3828f, 9.0177f)
                close()
                moveTo(3.6385f, 7.7154f)
                curveTo(2.4476f, 8.396f, 1.8353f, 9.8969f, 2.5549f, 11.1309f)
                lineTo(3.8507f, 10.3753f)
                curveTo(3.6404f, 10.0146f, 3.7514f, 9.3785f, 4.3828f, 9.0177f)
                lineTo(3.6385f, 7.7154f)
                close()
                moveTo(7.049f, 3.7503f)
                lineTo(7.8909f, 5.194f)
                lineTo(9.1866f, 4.4384f)
                lineTo(8.3447f, 2.9947f)
                lineTo(7.049f, 3.7503f)
                close()
                moveTo(7.8909f, 5.194f)
                lineTo(10.4165f, 9.5252f)
                lineTo(11.7123f, 8.7696f)
                lineTo(9.1866f, 4.4384f)
                lineTo(7.8909f, 5.194f)
                close()
                moveTo(8.8338f, 11.377f)
                lineTo(7.1501f, 8.4896f)
                lineTo(5.8543f, 9.2452f)
                lineTo(7.5381f, 12.1327f)
                lineTo(8.8338f, 11.377f)
                close()
                moveTo(7.1501f, 8.4896f)
                lineTo(5.0454f, 4.8804f)
                lineTo(3.7496f, 5.636f)
                lineTo(5.8543f, 9.2452f)
                lineTo(7.1501f, 8.4896f)
                close()
                moveTo(5.5774f, 3.5228f)
                curveTo(6.2111f, 3.1607f, 6.8349f, 3.3833f, 7.049f, 3.7503f)
                lineTo(8.3447f, 2.9947f)
                curveTo(7.6289f, 1.7671f, 6.0216f, 1.5412f, 4.8331f, 2.2205f)
                lineTo(5.5774f, 3.5228f)
                close()
                moveTo(4.8331f, 2.2205f)
                curveTo(3.6423f, 2.9011f, 3.03f, 4.402f, 3.7496f, 5.636f)
                lineTo(5.0454f, 4.8804f)
                curveTo(4.835f, 4.5197f, 4.9461f, 3.8836f, 5.5774f, 3.5228f)
                lineTo(4.8331f, 2.2205f)
                close()
                moveTo(11.1902f, 3.3084f)
                lineTo(13.7159f, 7.6395f)
                lineTo(15.0117f, 6.8839f)
                lineTo(12.486f, 2.5528f)
                lineTo(11.1902f, 3.3084f)
                close()
                moveTo(13.7159f, 7.6395f)
                lineTo(15.3997f, 10.5269f)
                lineTo(16.6954f, 9.7713f)
                lineTo(15.0117f, 6.8839f)
                lineTo(13.7159f, 7.6395f)
                close()
                moveTo(9.7187f, 3.0809f)
                curveTo(10.3524f, 2.7187f, 10.9762f, 2.9413f, 11.1902f, 3.3084f)
                lineTo(12.486f, 2.5528f)
                curveTo(11.7701f, 1.3252f, 10.1629f, 1.0993f, 8.9744f, 1.7786f)
                lineTo(9.7187f, 3.0809f)
                close()
                moveTo(8.9744f, 1.7786f)
                curveTo(7.7835f, 2.4591f, 7.1713f, 3.9601f, 7.8909f, 5.194f)
                lineTo(9.1866f, 4.4384f)
                curveTo(8.9763f, 4.0777f, 9.0873f, 3.4417f, 9.7187f, 3.0809f)
                lineTo(8.9744f, 1.7786f)
                close()
                moveTo(17.0153f, 5.7539f)
                lineTo(19.5409f, 10.085f)
                lineTo(20.8367f, 9.3294f)
                lineTo(18.311f, 4.9983f)
                lineTo(17.0153f, 5.7539f)
                close()
                moveTo(15.5437f, 5.5264f)
                curveTo(16.1774f, 5.1642f, 16.8012f, 5.3868f, 17.0153f, 5.7539f)
                lineTo(18.311f, 4.9983f)
                curveTo(17.5952f, 3.7707f, 15.988f, 3.5448f, 14.7994f, 4.224f)
                lineTo(15.5437f, 5.5264f)
                close()
                moveTo(14.7994f, 4.224f)
                curveTo(13.6086f, 4.9046f, 12.9963f, 6.4056f, 13.7159f, 7.6395f)
                lineTo(15.0117f, 6.8839f)
                curveTo(14.8013f, 6.5232f, 14.9124f, 5.8872f, 15.5437f, 5.5264f)
                lineTo(14.7994f, 4.224f)
                close()
                moveTo(2.5549f, 11.1309f)
                lineTo(6.3434f, 17.6276f)
                lineTo(7.6392f, 16.8719f)
                lineTo(3.8507f, 10.3753f)
                lineTo(2.5549f, 11.1309f)
                close()
                moveTo(16.5854f, 18.6021f)
                curveTo(13.2185f, 20.5264f, 9.2481f, 19.631f, 7.6392f, 16.8719f)
                lineTo(6.3434f, 17.6276f)
                curveTo(8.4541f, 21.2472f, 13.4079f, 22.1458f, 17.3297f, 19.9045f)
                lineTo(16.5854f, 18.6021f)
                close()
                moveTo(19.5409f, 10.085f)
                curveTo(21.1461f, 12.8377f, 19.9501f, 16.6792f, 16.5854f, 18.6021f)
                lineTo(17.3297f, 19.9045f)
                curveTo(21.2539f, 17.6618f, 22.9512f, 12.9554f, 20.8367f, 9.3294f)
                lineTo(19.5409f, 10.085f)
                close()
                moveTo(15.0798f, 14.5444f)
                curveTo(14.4045f, 13.3863f, 14.8772f, 11.6818f, 16.4197f, 10.8003f)
                lineTo(15.6754f, 9.498f)
                curveTo(13.5735f, 10.6993f, 12.5995f, 13.2687f, 13.784f, 15.3f)
                lineTo(15.0798f, 14.5444f)
                close()
            }
        }
            .build()
        return _handShake!!
    }

private var _handShake: ImageVector? = null
