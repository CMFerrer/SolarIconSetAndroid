package com.chiksmedina.solar.outline.notes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.NotesGroup

val NotesGroup.ArchiveMinimalistic: ImageVector
    get() {
        if (_archiveMinimalistic != null) {
            return _archiveMinimalistic!!
        }
        _archiveMinimalistic = Builder(
            name = "ArchiveMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.9426f, 1.25f)
                horizontalLineTo(12.0574f)
                curveTo(14.3658f, 1.25f, 16.1748f, 1.25f, 17.5863f, 1.4397f)
                curveTo(19.031f, 1.634f, 20.1711f, 2.0393f, 21.0659f, 2.9341f)
                curveTo(21.9607f, 3.8289f, 22.366f, 4.969f, 22.5603f, 6.4137f)
                curveTo(22.75f, 7.8252f, 22.75f, 9.6342f, 22.75f, 11.9426f)
                verticalLineTo(12.0f)
                horizontalLineTo(22.7391f)
                curveTo(22.75f, 12.5789f, 22.75f, 13.2299f, 22.75f, 13.9664f)
                verticalLineTo(14.0336f)
                curveTo(22.75f, 15.4053f, 22.75f, 16.4807f, 22.6794f, 17.3451f)
                curveTo(22.6075f, 18.2252f, 22.4586f, 18.9523f, 22.1233f, 19.6104f)
                curveTo(21.572f, 20.6924f, 20.6924f, 21.572f, 19.6104f, 22.1233f)
                curveTo(18.9523f, 22.4586f, 18.2252f, 22.6075f, 17.3451f, 22.6794f)
                curveTo(16.4807f, 22.75f, 15.4053f, 22.75f, 14.0336f, 22.75f)
                horizontalLineTo(9.9664f)
                curveTo(8.5947f, 22.75f, 7.5193f, 22.75f, 6.6549f, 22.6794f)
                curveTo(5.7748f, 22.6075f, 5.0477f, 22.4586f, 4.3896f, 22.1233f)
                curveTo(3.3076f, 21.572f, 2.428f, 20.6924f, 1.8767f, 19.6104f)
                curveTo(1.5414f, 18.9523f, 1.3925f, 18.2252f, 1.3206f, 17.3451f)
                curveTo(1.25f, 16.4807f, 1.25f, 15.4053f, 1.25f, 14.0336f)
                verticalLineTo(13.9664f)
                curveTo(1.25f, 13.2299f, 1.25f, 12.5789f, 1.2609f, 12.0f)
                horizontalLineTo(1.25f)
                lineTo(1.25f, 11.9426f)
                curveTo(1.25f, 9.6342f, 1.25f, 7.8252f, 1.4397f, 6.4137f)
                curveTo(1.634f, 4.969f, 2.0393f, 3.8289f, 2.9341f, 2.9341f)
                curveTo(3.8289f, 2.0393f, 4.969f, 1.634f, 6.4137f, 1.4397f)
                curveTo(7.8252f, 1.25f, 9.6342f, 1.25f, 11.9426f, 1.25f)
                close()
                moveTo(2.882f, 6.987f)
                curveTo(3.3178f, 6.5397f, 3.8263f, 6.1637f, 4.3896f, 5.8767f)
                curveTo(5.0477f, 5.5414f, 5.7748f, 5.3925f, 6.6549f, 5.3206f)
                curveTo(7.5193f, 5.25f, 8.5947f, 5.25f, 9.9664f, 5.25f)
                horizontalLineTo(14.0336f)
                curveTo(15.4053f, 5.25f, 16.4807f, 5.25f, 17.3451f, 5.3206f)
                curveTo(18.2252f, 5.3925f, 18.9523f, 5.5414f, 19.6104f, 5.8767f)
                curveTo(20.1737f, 6.1637f, 20.6822f, 6.5398f, 21.118f, 6.987f)
                curveTo(21.1046f, 6.8588f, 21.0899f, 6.7344f, 21.0736f, 6.6136f)
                curveTo(20.9018f, 5.3352f, 20.5749f, 4.5644f, 20.0052f, 3.9948f)
                curveTo(19.4355f, 3.4251f, 18.6648f, 3.0982f, 17.3864f, 2.9264f)
                curveTo(16.0864f, 2.7516f, 14.3782f, 2.75f, 12.0f, 2.75f)
                curveTo(9.6218f, 2.75f, 7.9136f, 2.7516f, 6.6136f, 2.9264f)
                curveTo(5.3352f, 3.0982f, 4.5644f, 3.4251f, 3.9948f, 3.9948f)
                curveTo(3.4251f, 4.5644f, 3.0982f, 5.3352f, 2.9264f, 6.6136f)
                curveTo(2.9101f, 6.7344f, 2.8954f, 6.8588f, 2.882f, 6.987f)
                close()
                moveTo(6.7771f, 6.8156f)
                curveTo(5.9897f, 6.88f, 5.482f, 7.0036f, 5.0705f, 7.2132f)
                curveTo(4.2709f, 7.6207f, 3.6207f, 8.2709f, 3.2132f, 9.0705f)
                curveTo(3.0036f, 9.482f, 2.88f, 9.9897f, 2.8156f, 10.7771f)
                curveTo(2.7506f, 11.5732f, 2.75f, 12.5875f, 2.75f, 14.0f)
                curveTo(2.75f, 15.4125f, 2.7506f, 16.4268f, 2.8156f, 17.2229f)
                curveTo(2.88f, 18.0103f, 3.0036f, 18.518f, 3.2132f, 18.9295f)
                curveTo(3.6207f, 19.7291f, 4.2709f, 20.3793f, 5.0705f, 20.7868f)
                curveTo(5.482f, 20.9964f, 5.9897f, 21.12f, 6.7771f, 21.1844f)
                curveTo(7.5732f, 21.2494f, 8.5875f, 21.25f, 10.0f, 21.25f)
                horizontalLineTo(14.0f)
                curveTo(15.4125f, 21.25f, 16.4268f, 21.2494f, 17.2229f, 21.1844f)
                curveTo(18.0103f, 21.12f, 18.518f, 20.9964f, 18.9295f, 20.7868f)
                curveTo(19.7291f, 20.3793f, 20.3793f, 19.7291f, 20.7868f, 18.9295f)
                curveTo(20.9964f, 18.518f, 21.12f, 18.0103f, 21.1844f, 17.2229f)
                curveTo(21.2494f, 16.4268f, 21.25f, 15.4125f, 21.25f, 14.0f)
                curveTo(21.25f, 12.5875f, 21.2494f, 11.5732f, 21.1844f, 10.7771f)
                curveTo(21.12f, 9.9897f, 20.9964f, 9.482f, 20.7868f, 9.0705f)
                curveTo(20.3793f, 8.2709f, 19.7291f, 7.6207f, 18.9295f, 7.2132f)
                curveTo(18.518f, 7.0036f, 18.0103f, 6.88f, 17.2229f, 6.8156f)
                curveTo(16.4268f, 6.7506f, 15.4125f, 6.75f, 14.0f, 6.75f)
                horizontalLineTo(10.0f)
                curveTo(8.5875f, 6.75f, 7.5732f, 6.7506f, 6.7771f, 6.8156f)
                close()
                moveTo(14.9995f, 11.4405f)
                curveTo(15.3085f, 11.7164f, 15.3353f, 12.1905f, 15.0595f, 12.4995f)
                lineTo(11.488f, 16.4995f)
                curveTo(11.3457f, 16.6589f, 11.1422f, 16.75f, 10.9286f, 16.75f)
                curveTo(10.7149f, 16.75f, 10.5114f, 16.6589f, 10.3691f, 16.4995f)
                lineTo(8.9405f, 14.8995f)
                curveTo(8.6647f, 14.5905f, 8.6915f, 14.1164f, 9.0005f, 13.8405f)
                curveTo(9.3095f, 13.5647f, 9.7836f, 13.5915f, 10.0595f, 13.9005f)
                lineTo(10.9286f, 14.8739f)
                lineTo(13.9405f, 11.5005f)
                curveTo(14.2164f, 11.1915f, 14.6905f, 11.1647f, 14.9995f, 11.4405f)
                close()
            }
        }
            .build()
        return _archiveMinimalistic!!
    }

private var _archiveMinimalistic: ImageVector? = null
