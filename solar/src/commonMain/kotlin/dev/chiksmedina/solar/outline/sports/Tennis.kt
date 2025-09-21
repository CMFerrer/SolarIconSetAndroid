package dev.chiksmedina.solar.outline.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.SportsGroup

val SportsGroup.Tennis: ImageVector
    get() {
        if (_tennis != null) {
            return _tennis!!
        }
        _tennis = Builder(
            name = "Tennis", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.4507f, 2.76f)
                curveTo(10.7344f, 2.6745f, 8.975f, 3.0658f, 7.3752f, 3.9895f)
                curveTo(5.7762f, 4.9127f, 4.557f, 6.2412f, 3.7727f, 7.7704f)
                curveTo(4.1379f, 8.0039f, 4.6383f, 8.3539f, 5.2145f, 8.8377f)
                curveTo(6.3908f, 9.8254f, 7.885f, 11.3728f, 9.1854f, 13.6252f)
                curveTo(10.4859f, 15.8777f, 11.0789f, 17.9453f, 11.3461f, 19.458f)
                curveTo(11.477f, 20.1989f, 11.5299f, 20.8073f, 11.5495f, 21.2403f)
                curveTo(13.266f, 21.3257f, 15.0261f, 20.9342f, 16.6252f, 20.0109f)
                curveTo(18.225f, 19.0873f, 19.4436f, 17.7593f, 20.2277f, 16.2302f)
                curveTo(19.8625f, 15.9967f, 19.3619f, 15.6467f, 18.7856f, 15.1628f)
                curveTo(17.6092f, 14.1751f, 16.115f, 12.6277f, 14.8146f, 10.3752f)
                curveTo(13.5141f, 8.1228f, 12.9212f, 6.0551f, 12.654f, 4.5425f)
                curveTo(12.5231f, 3.8015f, 12.4702f, 3.193f, 12.4507f, 2.76f)
                close()
                moveTo(13.9649f, 2.9611f)
                curveTo(13.9898f, 3.3103f, 14.0385f, 3.757f, 14.1311f, 4.2815f)
                curveTo(14.373f, 5.6508f, 14.9141f, 7.5476f, 16.1136f, 9.6252f)
                curveTo(17.3132f, 11.7029f, 18.6853f, 13.1199f, 19.7502f, 14.014f)
                curveTo(20.1581f, 14.3566f, 20.5207f, 14.6221f, 20.8106f, 14.8182f)
                curveTo(21.5766f, 12.4212f, 21.3673f, 9.7246f, 20.0109f, 7.3752f)
                curveTo(18.6545f, 5.0258f, 16.4237f, 3.4963f, 13.9649f, 2.9611f)
                close()
                moveTo(10.0353f, 21.0391f)
                curveTo(10.0103f, 20.6901f, 9.9617f, 20.2434f, 9.869f, 19.7189f)
                curveTo(9.6271f, 18.3497f, 9.0859f, 16.4529f, 7.8864f, 14.3752f)
                curveTo(6.6868f, 12.2976f, 5.3148f, 10.8805f, 4.2499f, 9.9864f)
                curveTo(3.8421f, 9.6439f, 3.4796f, 9.3785f, 3.1898f, 9.1824f)
                curveTo(2.4243f, 11.5781f, 2.6329f, 14.2755f, 3.9895f, 16.6252f)
                curveTo(5.346f, 18.9748f, 7.5778f, 20.5042f, 10.0353f, 21.0391f)
                close()
                moveTo(6.6252f, 2.6904f)
                curveTo(8.7203f, 1.4808f, 11.0554f, 1.0564f, 13.2862f, 1.3268f)
                curveTo(16.526f, 1.7195f, 19.5512f, 3.579f, 21.31f, 6.6252f)
                curveTo(23.0687f, 9.6714f, 23.1664f, 13.2211f, 21.8867f, 16.2231f)
                curveTo(21.0054f, 18.2903f, 19.4703f, 20.1004f, 17.3752f, 21.31f)
                curveTo(12.2336f, 24.2785f, 5.659f, 22.5168f, 2.6904f, 17.3752f)
                curveTo(-0.2781f, 12.2335f, 1.4836f, 5.6589f, 6.6252f, 2.6904f)
                close()
            }
        }
            .build()
        return _tennis!!
    }

private var _tennis: ImageVector? = null
