package com.chiksmedina.solar.outline.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.ElectronicDevicesGroup

public val ElectronicDevicesGroup.SsdSquare: ImageVector
    get() {
        if (_ssdSquare != null) {
            return _ssdSquare!!
        }
        _ssdSquare = Builder(name = "SsdSquare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.5f, 16.25f)
                curveTo(11.9142f, 16.25f, 12.25f, 16.5858f, 12.25f, 17.0f)
                verticalLineTo(18.0f)
                curveTo(12.25f, 18.4142f, 11.9142f, 18.75f, 11.5f, 18.75f)
                curveTo(11.0858f, 18.75f, 10.75f, 18.4142f, 10.75f, 18.0f)
                verticalLineTo(17.0f)
                curveTo(10.75f, 16.5858f, 11.0858f, 16.25f, 11.5f, 16.25f)
                close()
                moveTo(14.0f, 16.25f)
                curveTo(14.4142f, 16.25f, 14.75f, 16.5858f, 14.75f, 17.0f)
                verticalLineTo(18.0f)
                curveTo(14.75f, 18.4142f, 14.4142f, 18.75f, 14.0f, 18.75f)
                curveTo(13.5858f, 18.75f, 13.25f, 18.4142f, 13.25f, 18.0f)
                verticalLineTo(17.0f)
                curveTo(13.25f, 16.5858f, 13.5858f, 16.25f, 14.0f, 16.25f)
                close()
                moveTo(16.5f, 16.25f)
                curveTo(16.9142f, 16.25f, 17.25f, 16.5858f, 17.25f, 17.0f)
                verticalLineTo(18.0f)
                curveTo(17.25f, 18.4142f, 16.9142f, 18.75f, 16.5f, 18.75f)
                curveTo(16.0858f, 18.75f, 15.75f, 18.4142f, 15.75f, 18.0f)
                verticalLineTo(17.0f)
                curveTo(15.75f, 16.5858f, 16.0858f, 16.25f, 16.5f, 16.25f)
                close()
                moveTo(19.0f, 16.25f)
                curveTo(19.4142f, 16.25f, 19.75f, 16.5858f, 19.75f, 17.0f)
                verticalLineTo(18.0f)
                curveTo(19.75f, 18.4142f, 19.4142f, 18.75f, 19.0f, 18.75f)
                curveTo(18.5858f, 18.75f, 18.25f, 18.4142f, 18.25f, 18.0f)
                verticalLineTo(17.0f)
                curveTo(18.25f, 16.5858f, 18.5858f, 16.25f, 19.0f, 16.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.5622f, 2.8717f)
                curveTo(6.1486f, 2.4146f, 6.8236f, 2.25f, 7.5f, 2.25f)
                horizontalLineTo(16.5f)
                curveTo(17.1765f, 2.25f, 17.8514f, 2.4146f, 18.4378f, 2.8717f)
                curveTo(19.0172f, 3.3234f, 19.4352f, 4.0024f, 19.7154f, 4.8924f)
                lineTo(19.718f, 4.9006f)
                lineTo(22.5718f, 14.7467f)
                curveTo(22.6403f, 14.9806f, 22.6798f, 15.2261f, 22.7044f, 15.4827f)
                curveTo(22.75f, 15.9572f, 22.75f, 16.5451f, 22.75f, 17.2573f)
                verticalLineTo(17.331f)
                curveTo(22.75f, 18.0431f, 22.75f, 18.631f, 22.7044f, 19.1056f)
                curveTo(22.657f, 19.5988f, 22.5548f, 20.0509f, 22.2972f, 20.4591f)
                curveTo(22.1f, 20.7716f, 21.8448f, 21.0428f, 21.5443f, 21.2554f)
                curveTo(21.1461f, 21.5371f, 20.7019f, 21.6495f, 20.2234f, 21.7011f)
                curveTo(19.7689f, 21.75f, 19.2082f, 21.75f, 18.5402f, 21.75f)
                horizontalLineTo(5.4598f)
                curveTo(4.7918f, 21.75f, 4.2312f, 21.75f, 3.7766f, 21.7011f)
                curveTo(3.2981f, 21.6495f, 2.8539f, 21.5371f, 2.4557f, 21.2554f)
                curveTo(2.1552f, 21.0428f, 1.9f, 20.7716f, 1.7028f, 20.4591f)
                curveTo(1.4452f, 20.0509f, 1.343f, 19.5988f, 1.2956f, 19.1056f)
                curveTo(1.25f, 18.631f, 1.25f, 18.0432f, 1.25f, 17.331f)
                verticalLineTo(17.2572f)
                curveTo(1.25f, 16.5451f, 1.25f, 15.9572f, 1.2956f, 15.4827f)
                curveTo(1.3202f, 15.2261f, 1.3597f, 14.9806f, 1.4282f, 14.7467f)
                lineTo(4.282f, 4.9006f)
                lineTo(4.2846f, 4.8924f)
                curveTo(4.5648f, 4.0024f, 4.9828f, 3.3234f, 5.5622f, 2.8717f)
                close()
                moveTo(3.5188f, 12.922f)
                curveTo(3.6036f, 12.9079f, 3.6895f, 12.8965f, 3.7766f, 12.8872f)
                curveTo(4.2312f, 12.8382f, 4.7918f, 12.8382f, 5.4598f, 12.8382f)
                horizontalLineTo(18.5402f)
                curveTo(19.2082f, 12.8382f, 19.7688f, 12.8382f, 20.2234f, 12.8872f)
                curveTo(20.3105f, 12.8965f, 20.3964f, 12.9079f, 20.4812f, 12.922f)
                lineTo(18.2821f, 5.3349f)
                curveTo(18.0627f, 4.6418f, 17.784f, 4.264f, 17.5156f, 4.0547f)
                curveTo(17.2532f, 3.8502f, 16.9281f, 3.75f, 16.5f, 3.75f)
                horizontalLineTo(7.5f)
                curveTo(7.0719f, 3.75f, 6.7468f, 3.8502f, 6.4844f, 4.0547f)
                curveTo(6.216f, 4.264f, 5.9373f, 4.6418f, 5.7179f, 5.3349f)
                lineTo(3.5188f, 12.922f)
                close()
                moveTo(3.9372f, 14.3785f)
                curveTo(3.5874f, 14.4162f, 3.4283f, 14.4822f, 3.322f, 14.5574f)
                curveTo(3.1857f, 14.6538f, 3.0659f, 14.7797f, 2.9713f, 14.9296f)
                curveTo(2.8918f, 15.0556f, 2.8256f, 15.2423f, 2.7887f, 15.6261f)
                curveTo(2.7508f, 16.0204f, 2.75f, 16.5358f, 2.75f, 17.2941f)
                curveTo(2.75f, 18.0524f, 2.7508f, 18.5678f, 2.7887f, 18.9621f)
                curveTo(2.8256f, 19.3459f, 2.8918f, 19.5327f, 2.9713f, 19.6586f)
                curveTo(3.0659f, 19.8085f, 3.1857f, 19.9344f, 3.322f, 20.0308f)
                curveTo(3.4283f, 20.106f, 3.5874f, 20.172f, 3.9372f, 20.2097f)
                curveTo(4.3019f, 20.249f, 4.7813f, 20.25f, 5.5f, 20.25f)
                horizontalLineTo(18.5f)
                curveTo(19.2187f, 20.25f, 19.6981f, 20.249f, 20.0628f, 20.2097f)
                curveTo(20.4126f, 20.172f, 20.5717f, 20.106f, 20.678f, 20.0308f)
                curveTo(20.8143f, 19.9344f, 20.9341f, 19.8085f, 21.0287f, 19.6586f)
                curveTo(21.1082f, 19.5327f, 21.1744f, 19.3459f, 21.2113f, 18.9621f)
                curveTo(21.2492f, 18.5678f, 21.25f, 18.0524f, 21.25f, 17.2941f)
                curveTo(21.25f, 16.5358f, 21.2492f, 16.0204f, 21.2113f, 15.6261f)
                curveTo(21.1744f, 15.2423f, 21.1082f, 15.0556f, 21.0287f, 14.9296f)
                curveTo(20.9341f, 14.7797f, 20.8143f, 14.6538f, 20.678f, 14.5574f)
                curveTo(20.5717f, 14.4822f, 20.4126f, 14.4162f, 20.0628f, 14.3785f)
                curveTo(19.6981f, 14.3393f, 19.2187f, 14.3382f, 18.5f, 14.3382f)
                horizontalLineTo(5.5f)
                curveTo(4.7813f, 14.3382f, 4.3019f, 14.3393f, 3.9372f, 14.3785f)
                close()
            }
        }
        .build()
        return _ssdSquare!!
    }

private var _ssdSquare: ImageVector? = null
