package dev.chiksmedina.solar.bold.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.ArrowsGroup

val ArrowsGroup.RefreshSquare: ImageVector
    get() {
        if (_refreshSquare != null) {
            return _refreshSquare!!
        }
        _refreshSquare = Builder(
            name = "RefreshSquare", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(3.4645f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0f)
                curveTo(2.0f, 16.714f, 2.0f, 19.0711f, 3.4645f, 20.5355f)
                curveTo(4.9289f, 22.0f, 7.286f, 22.0f, 12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.714f, 22.0f, 12.0f)
                curveTo(22.0f, 7.286f, 22.0f, 4.9289f, 20.5355f, 3.4645f)
                curveTo(19.0711f, 2.0f, 16.714f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                close()
                moveTo(5.4606f, 11.0833f)
                curveTo(5.8333f, 7.7999f, 8.6241f, 5.25f, 12.0096f, 5.25f)
                curveTo(13.9916f, 5.25f, 15.7702f, 6.1247f, 16.9775f, 7.5065f)
                curveTo(17.25f, 7.8185f, 17.2181f, 8.2923f, 16.9061f, 8.5648f)
                curveTo(16.5942f, 8.8373f, 16.1204f, 8.8054f, 15.8479f, 8.4935f)
                curveTo(14.9136f, 7.4241f, 13.541f, 6.75f, 12.0096f, 6.75f)
                curveTo(9.4522f, 6.75f, 7.3364f, 8.6322f, 6.9733f, 11.0833f)
                horizontalLineTo(7.3365f)
                curveTo(7.64f, 11.0833f, 7.9135f, 11.2662f, 8.0295f, 11.5466f)
                curveTo(8.1456f, 11.8269f, 8.0812f, 12.1496f, 7.8665f, 12.364f)
                lineTo(6.6982f, 13.5307f)
                curveTo(6.4054f, 13.8231f, 5.9311f, 13.8231f, 5.6383f, 13.5307f)
                lineTo(4.47f, 12.364f)
                curveTo(4.2553f, 12.1496f, 4.191f, 11.8269f, 4.307f, 11.5466f)
                curveTo(4.423f, 11.2662f, 4.6966f, 11.0833f, 5.0f, 11.0833f)
                horizontalLineTo(5.4606f)
                close()
                moveTo(17.3018f, 10.4693f)
                curveTo(17.5947f, 10.1769f, 18.069f, 10.1769f, 18.3618f, 10.4693f)
                lineTo(19.53f, 11.636f)
                curveTo(19.7448f, 11.8504f, 19.8091f, 12.1731f, 19.6931f, 12.4534f)
                curveTo(19.5771f, 12.7338f, 19.3035f, 12.9167f, 19.0001f, 12.9167f)
                horizontalLineTo(18.5395f)
                curveTo(18.1668f, 16.2001f, 15.376f, 18.75f, 11.9905f, 18.75f)
                curveTo(10.0085f, 18.75f, 8.2299f, 17.8753f, 7.0226f, 16.4935f)
                curveTo(6.7501f, 16.1815f, 6.782f, 15.7077f, 7.094f, 15.4352f)
                curveTo(7.4059f, 15.1627f, 7.8797f, 15.1946f, 8.1522f, 15.5065f)
                curveTo(9.0865f, 16.5759f, 10.4591f, 17.25f, 11.9905f, 17.25f)
                curveTo(14.548f, 17.25f, 16.6637f, 15.3678f, 17.0268f, 12.9167f)
                horizontalLineTo(16.6636f)
                curveTo(16.3601f, 12.9167f, 16.0866f, 12.7338f, 15.9705f, 12.4534f)
                curveTo(15.8545f, 12.1731f, 15.9189f, 11.8504f, 16.1336f, 11.636f)
                lineTo(17.3018f, 10.4693f)
                close()
            }
        }
            .build()
        return _refreshSquare!!
    }

private var _refreshSquare: ImageVector? = null
