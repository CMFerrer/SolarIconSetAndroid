package com.chiksmedina.solar.linear.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.ElectronicDevicesGroup

public val ElectronicDevicesGroup.SsdSquare: ImageVector
    get() {
        if (_ssdSquare != null) {
            return _ssdSquare!!
        }
        _ssdSquare = Builder(name = "SsdSquare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 17.0f)
                verticalLineTo(18.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.5f, 17.0f)
                verticalLineTo(18.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 17.0f)
                verticalLineTo(18.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.5f, 17.0f)
                verticalLineTo(18.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 5.1177f)
                lineTo(19.7204f, 4.9089f)
                lineTo(19.718f, 4.9006f)
                lineTo(19.7154f, 4.8924f)
                lineTo(19.0f, 5.1177f)
                close()
                moveTo(5.0f, 5.1177f)
                lineTo(4.2846f, 4.8924f)
                lineTo(4.282f, 4.9006f)
                lineTo(4.2797f, 4.9089f)
                lineTo(5.0f, 5.1177f)
                close()
                moveTo(2.8889f, 20.6431f)
                lineTo(3.322f, 20.0308f)
                lineTo(2.8889f, 20.6431f)
                close()
                moveTo(2.3371f, 20.0589f)
                lineTo(2.9713f, 19.6586f)
                lineTo(2.3371f, 20.0589f)
                close()
                moveTo(21.6629f, 20.0589f)
                lineTo(21.0287f, 19.6586f)
                lineTo(21.6629f, 20.0589f)
                close()
                moveTo(21.1111f, 20.6431f)
                lineTo(20.678f, 20.0308f)
                lineTo(21.1111f, 20.6431f)
                close()
                moveTo(21.1111f, 13.9451f)
                lineTo(20.678f, 14.5574f)
                lineTo(21.1111f, 13.9451f)
                close()
                moveTo(21.6629f, 14.5294f)
                lineTo(21.0287f, 14.9296f)
                lineTo(21.6629f, 14.5294f)
                close()
                moveTo(2.8889f, 13.9451f)
                lineTo(3.322f, 14.5574f)
                lineTo(2.8889f, 13.9451f)
                close()
                moveTo(2.3371f, 14.5294f)
                lineTo(2.9713f, 14.9296f)
                lineTo(2.3371f, 14.5294f)
                close()
                moveTo(7.5f, 3.75f)
                horizontalLineTo(16.5f)
                verticalLineTo(2.25f)
                horizontalLineTo(7.5f)
                verticalLineTo(3.75f)
                close()
                moveTo(16.5f, 3.75f)
                curveTo(16.9281f, 3.75f, 17.2532f, 3.8502f, 17.5156f, 4.0547f)
                curveTo(17.785f, 4.2648f, 18.0648f, 4.6447f, 18.2846f, 5.3429f)
                lineTo(19.7154f, 4.8924f)
                curveTo(19.4352f, 4.0024f, 19.0172f, 3.3234f, 18.4378f, 2.8717f)
                curveTo(17.8514f, 2.4146f, 17.1765f, 2.25f, 16.5f, 2.25f)
                verticalLineTo(3.75f)
                close()
                moveTo(7.5f, 2.25f)
                curveTo(6.8236f, 2.25f, 6.1486f, 2.4146f, 5.5622f, 2.8717f)
                curveTo(4.9828f, 3.3234f, 4.5648f, 4.0024f, 4.2846f, 4.8924f)
                lineTo(5.7154f, 5.3429f)
                curveTo(5.9352f, 4.6447f, 6.215f, 4.2648f, 6.4844f, 4.0547f)
                curveTo(6.7468f, 3.8502f, 7.0719f, 3.75f, 7.5f, 3.75f)
                verticalLineTo(2.25f)
                close()
                moveTo(18.2796f, 5.3264f)
                lineTo(21.1312f, 15.1645f)
                lineTo(22.5719f, 14.7469f)
                lineTo(19.7204f, 4.9089f)
                lineTo(18.2796f, 5.3264f)
                close()
                moveTo(4.2797f, 4.9089f)
                lineTo(1.4281f, 14.7469f)
                lineTo(2.8688f, 15.1645f)
                lineTo(5.7203f, 5.3264f)
                lineTo(4.2797f, 4.9089f)
                close()
                moveTo(5.5f, 14.3382f)
                horizontalLineTo(18.5f)
                verticalLineTo(12.8382f)
                horizontalLineTo(5.5f)
                verticalLineTo(14.3382f)
                close()
                moveTo(18.5f, 20.25f)
                horizontalLineTo(5.5f)
                verticalLineTo(21.75f)
                horizontalLineTo(18.5f)
                verticalLineTo(20.25f)
                close()
                moveTo(5.5f, 20.25f)
                curveTo(4.7813f, 20.25f, 4.3019f, 20.249f, 3.9372f, 20.2097f)
                curveTo(3.5874f, 20.172f, 3.4283f, 20.106f, 3.322f, 20.0308f)
                lineTo(2.4557f, 21.2554f)
                curveTo(2.8539f, 21.5371f, 3.2981f, 21.6495f, 3.7766f, 21.7011f)
                curveTo(4.2402f, 21.751f, 4.8143f, 21.75f, 5.5f, 21.75f)
                verticalLineTo(20.25f)
                close()
                moveTo(1.25f, 17.2941f)
                curveTo(1.25f, 18.0229f, 1.2492f, 18.6228f, 1.2956f, 19.1056f)
                curveTo(1.343f, 19.5988f, 1.4452f, 20.0509f, 1.7028f, 20.4591f)
                lineTo(2.9713f, 19.6586f)
                curveTo(2.8918f, 19.5327f, 2.8256f, 19.3459f, 2.7887f, 18.9621f)
                curveTo(2.7508f, 18.5678f, 2.75f, 18.0524f, 2.75f, 17.2941f)
                horizontalLineTo(1.25f)
                close()
                moveTo(3.322f, 20.0308f)
                curveTo(3.1857f, 19.9344f, 3.0659f, 19.8085f, 2.9713f, 19.6586f)
                lineTo(1.7028f, 20.4591f)
                curveTo(1.9f, 20.7716f, 2.1552f, 21.0428f, 2.4557f, 21.2554f)
                lineTo(3.322f, 20.0308f)
                close()
                moveTo(21.25f, 17.2941f)
                curveTo(21.25f, 18.0524f, 21.2492f, 18.5678f, 21.2113f, 18.9621f)
                curveTo(21.1744f, 19.3459f, 21.1081f, 19.5327f, 21.0287f, 19.6586f)
                lineTo(22.2972f, 20.4591f)
                curveTo(22.5548f, 20.0509f, 22.657f, 19.5988f, 22.7044f, 19.1056f)
                curveTo(22.7508f, 18.6228f, 22.75f, 18.0229f, 22.75f, 17.2941f)
                horizontalLineTo(21.25f)
                close()
                moveTo(18.5f, 21.75f)
                curveTo(19.1857f, 21.75f, 19.7598f, 21.751f, 20.2234f, 21.7011f)
                curveTo(20.7019f, 21.6495f, 21.1461f, 21.5371f, 21.5443f, 21.2554f)
                lineTo(20.678f, 20.0308f)
                curveTo(20.5717f, 20.106f, 20.4126f, 20.172f, 20.0628f, 20.2097f)
                curveTo(19.6981f, 20.249f, 19.2187f, 20.25f, 18.5f, 20.25f)
                verticalLineTo(21.75f)
                close()
                moveTo(21.0287f, 19.6586f)
                curveTo(20.9341f, 19.8085f, 20.8143f, 19.9344f, 20.678f, 20.0308f)
                lineTo(21.5443f, 21.2554f)
                curveTo(21.8448f, 21.0428f, 22.1f, 20.7716f, 22.2972f, 20.4591f)
                lineTo(21.0287f, 19.6586f)
                close()
                moveTo(18.5f, 14.3382f)
                curveTo(19.2187f, 14.3382f, 19.6981f, 14.3393f, 20.0628f, 14.3785f)
                curveTo(20.4126f, 14.4162f, 20.5717f, 14.4822f, 20.678f, 14.5574f)
                lineTo(21.5443f, 13.3329f)
                curveTo(21.1461f, 13.0512f, 20.7019f, 12.9387f, 20.2234f, 12.8872f)
                curveTo(19.7598f, 12.8372f, 19.1857f, 12.8382f, 18.5f, 12.8382f)
                verticalLineTo(14.3382f)
                close()
                moveTo(22.75f, 17.2941f)
                curveTo(22.75f, 16.5653f, 22.7508f, 15.9654f, 22.7044f, 15.4827f)
                curveTo(22.657f, 14.9894f, 22.5548f, 14.5373f, 22.2972f, 14.1291f)
                lineTo(21.0287f, 14.9296f)
                curveTo(21.1081f, 15.0556f, 21.1744f, 15.2423f, 21.2113f, 15.6261f)
                curveTo(21.2492f, 16.0204f, 21.25f, 16.5358f, 21.25f, 17.2941f)
                horizontalLineTo(22.75f)
                close()
                moveTo(20.678f, 14.5574f)
                curveTo(20.8143f, 14.6538f, 20.9341f, 14.7797f, 21.0287f, 14.9296f)
                lineTo(22.2972f, 14.1291f)
                curveTo(22.1f, 13.8166f, 21.8448f, 13.5454f, 21.5443f, 13.3329f)
                lineTo(20.678f, 14.5574f)
                close()
                moveTo(5.5f, 12.8382f)
                curveTo(4.8143f, 12.8382f, 4.2402f, 12.8372f, 3.7766f, 12.8872f)
                curveTo(3.2981f, 12.9387f, 2.8539f, 13.0512f, 2.4557f, 13.3329f)
                lineTo(3.322f, 14.5574f)
                curveTo(3.4283f, 14.4822f, 3.5874f, 14.4162f, 3.9372f, 14.3785f)
                curveTo(4.3019f, 14.3393f, 4.7813f, 14.3382f, 5.5f, 14.3382f)
                verticalLineTo(12.8382f)
                close()
                moveTo(2.75f, 17.2941f)
                curveTo(2.75f, 16.5358f, 2.7508f, 16.0204f, 2.7887f, 15.6261f)
                curveTo(2.8256f, 15.2423f, 2.8918f, 15.0556f, 2.9713f, 14.9296f)
                lineTo(1.7028f, 14.1291f)
                curveTo(1.4452f, 14.5373f, 1.343f, 14.9894f, 1.2956f, 15.4827f)
                curveTo(1.2492f, 15.9654f, 1.25f, 16.5653f, 1.25f, 17.2941f)
                horizontalLineTo(2.75f)
                close()
                moveTo(2.4557f, 13.3329f)
                curveTo(2.1552f, 13.5454f, 1.9f, 13.8166f, 1.7028f, 14.1291f)
                lineTo(2.9713f, 14.9296f)
                curveTo(3.0659f, 14.7797f, 3.1857f, 14.6538f, 3.322f, 14.5574f)
                lineTo(2.4557f, 13.3329f)
                close()
            }
        }
        .build()
        return _ssdSquare!!
    }

private var _ssdSquare: ImageVector? = null
