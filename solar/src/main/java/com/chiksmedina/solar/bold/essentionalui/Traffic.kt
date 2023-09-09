package com.chiksmedina.solar.bold.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.EssentionalUiGroup

public val EssentionalUiGroup.Traffic: ImageVector
    get() {
        if (_traffic != null) {
            return _traffic!!
        }
        _traffic = Builder(name = "Traffic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(10.6831f, 18.6203f)
                curveTo(11.9925f, 18.8808f, 13.3497f, 18.7471f, 14.5831f, 18.2362f)
                curveTo(15.8165f, 17.7253f, 16.8707f, 16.8601f, 17.6124f, 15.7501f)
                curveTo(18.3541f, 14.6401f, 18.75f, 13.335f, 18.75f, 12.0f)
                curveTo(18.75f, 11.5858f, 18.4142f, 11.25f, 18.0f, 11.25f)
                curveTo(17.5858f, 11.25f, 17.25f, 11.5858f, 17.25f, 12.0f)
                curveTo(17.25f, 13.0384f, 16.9421f, 14.0534f, 16.3652f, 14.9167f)
                curveTo(15.7883f, 15.7801f, 14.9684f, 16.453f, 14.0091f, 16.8504f)
                curveTo(13.0498f, 17.2477f, 11.9942f, 17.3517f, 10.9758f, 17.1491f)
                curveTo(9.9574f, 16.9466f, 9.0219f, 16.4465f, 8.2877f, 15.7123f)
                curveTo(7.5535f, 14.9781f, 7.0535f, 14.0426f, 6.8509f, 13.0242f)
                curveTo(6.6483f, 12.0058f, 6.7523f, 10.9502f, 7.1496f, 9.9909f)
                curveTo(7.547f, 9.0316f, 8.2199f, 8.2117f, 9.0833f, 7.6348f)
                curveTo(9.9466f, 7.0579f, 10.9616f, 6.75f, 12.0f, 6.75f)
                curveTo(12.4142f, 6.75f, 12.75f, 6.4142f, 12.75f, 6.0f)
                curveTo(12.75f, 5.5858f, 12.4142f, 5.25f, 12.0f, 5.25f)
                curveTo(10.665f, 5.25f, 9.3599f, 5.6459f, 8.2499f, 6.3876f)
                curveTo(7.1399f, 7.1293f, 6.2747f, 8.1835f, 5.7638f, 9.4169f)
                curveTo(5.2529f, 10.6503f, 5.1192f, 12.0075f, 5.3797f, 13.3169f)
                curveTo(5.6402f, 14.6262f, 6.283f, 15.829f, 7.227f, 16.773f)
                curveTo(8.171f, 17.717f, 9.3738f, 18.3599f, 10.6831f, 18.6203f)
                close()
                moveTo(13.3109f, 6.0454f)
                curveTo(13.4741f, 5.6647f, 13.915f, 5.4884f, 14.2957f, 5.6516f)
                curveTo(16.1129f, 6.4307f, 17.5693f, 7.8871f, 18.3484f, 9.7043f)
                curveTo(18.5116f, 10.085f, 18.3353f, 10.5259f, 17.9546f, 10.6891f)
                curveTo(17.5739f, 10.8524f, 17.133f, 10.6761f, 16.9698f, 10.2954f)
                curveTo(16.3424f, 8.8321f, 15.1679f, 7.6576f, 13.7046f, 7.0302f)
                curveTo(13.3239f, 6.867f, 13.1476f, 6.4261f, 13.3109f, 6.0454f)
                close()
            }
        }
        .build()
        return _traffic!!
    }

private var _traffic: ImageVector? = null
