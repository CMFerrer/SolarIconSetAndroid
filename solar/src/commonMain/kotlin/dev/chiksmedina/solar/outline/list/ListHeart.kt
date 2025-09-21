package dev.chiksmedina.solar.outline.list

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.ListGroup

val ListGroup.ListHeart: ImageVector
    get() {
        if (_listHeart != null) {
            return _listHeart!!
        }
        _listHeart = Builder(
            name = "ListHeart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(2.25f, 6.0f)
                curveTo(2.25f, 5.5858f, 2.5858f, 5.25f, 3.0f, 5.25f)
                horizontalLineTo(21.0f)
                curveTo(21.4142f, 5.25f, 21.75f, 5.5858f, 21.75f, 6.0f)
                curveTo(21.75f, 6.4142f, 21.4142f, 6.75f, 21.0f, 6.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 6.75f, 2.25f, 6.4142f, 2.25f, 6.0f)
                close()
                moveTo(2.25f, 10.0f)
                curveTo(2.25f, 9.5858f, 2.5858f, 9.25f, 3.0f, 9.25f)
                horizontalLineTo(21.0f)
                curveTo(21.4142f, 9.25f, 21.75f, 9.5858f, 21.75f, 10.0f)
                curveTo(21.75f, 10.4142f, 21.4142f, 10.75f, 21.0f, 10.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 10.75f, 2.25f, 10.4142f, 2.25f, 10.0f)
                close()
                moveTo(20.095f, 12.3927f)
                curveTo(21.1303f, 12.766f, 21.75f, 13.7847f, 21.75f, 15.0361f)
                curveTo(21.75f, 15.9337f, 21.2258f, 16.7455f, 20.6944f, 17.3575f)
                curveTo(20.142f, 17.9937f, 19.4624f, 18.5488f, 18.9242f, 18.9449f)
                curveTo(18.8995f, 18.963f, 18.8746f, 18.9815f, 18.8495f, 19.0001f)
                curveTo(18.4897f, 19.267f, 18.0811f, 19.5701f, 17.5f, 19.5701f)
                curveTo(16.9189f, 19.5701f, 16.5103f, 19.267f, 16.1505f, 19.0001f)
                curveTo(16.1254f, 18.9815f, 16.1005f, 18.963f, 16.0758f, 18.9449f)
                curveTo(15.5376f, 18.5488f, 14.858f, 17.9937f, 14.3056f, 17.3575f)
                curveTo(13.7742f, 16.7455f, 13.25f, 15.9337f, 13.25f, 15.0361f)
                curveTo(13.25f, 13.7847f, 13.8697f, 12.766f, 14.905f, 12.3927f)
                curveTo(15.7404f, 12.0915f, 16.6754f, 12.2721f, 17.5f, 12.8537f)
                curveTo(18.3246f, 12.2721f, 19.2596f, 12.0915f, 20.095f, 12.3927f)
                close()
                moveTo(19.5862f, 13.8038f)
                curveTo(19.2492f, 13.6823f, 18.6667f, 13.7332f, 18.0263f, 14.364f)
                curveTo(17.7343f, 14.6515f, 17.2657f, 14.6515f, 16.9737f, 14.364f)
                curveTo(16.3333f, 13.7332f, 15.7508f, 13.6823f, 15.4138f, 13.8038f)
                curveTo(15.0929f, 13.9195f, 14.75f, 14.2796f, 14.75f, 15.0361f)
                curveTo(14.75f, 15.3733f, 14.9683f, 15.8329f, 15.4382f, 16.374f)
                curveTo(15.8871f, 16.891f, 16.4677f, 17.3709f, 16.9649f, 17.7367f)
                curveTo(17.1982f, 17.9084f, 17.3121f, 17.99f, 17.4032f, 18.0387f)
                curveTo(17.4621f, 18.0702f, 17.4787f, 18.0701f, 17.4984f, 18.0701f)
                lineTo(17.5f, 18.0701f)
                lineTo(17.5016f, 18.0701f)
                curveTo(17.5213f, 18.0701f, 17.5379f, 18.0702f, 17.5968f, 18.0387f)
                curveTo(17.688f, 17.99f, 17.8019f, 17.9084f, 18.0351f, 17.7367f)
                curveTo(18.5323f, 17.3709f, 19.1129f, 16.891f, 19.5618f, 16.374f)
                curveTo(20.0317f, 15.8329f, 20.25f, 15.3733f, 20.25f, 15.0361f)
                curveTo(20.25f, 14.2796f, 19.9071f, 13.9195f, 19.5862f, 13.8038f)
                close()
                moveTo(2.25f, 14.0f)
                curveTo(2.25f, 13.5858f, 2.5858f, 13.25f, 3.0f, 13.25f)
                horizontalLineTo(10.0f)
                curveTo(10.4142f, 13.25f, 10.75f, 13.5858f, 10.75f, 14.0f)
                curveTo(10.75f, 14.4142f, 10.4142f, 14.75f, 10.0f, 14.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 14.75f, 2.25f, 14.4142f, 2.25f, 14.0f)
                close()
                moveTo(2.25f, 18.0f)
                curveTo(2.25f, 17.5858f, 2.5858f, 17.25f, 3.0f, 17.25f)
                horizontalLineTo(10.0f)
                curveTo(10.4142f, 17.25f, 10.75f, 17.5858f, 10.75f, 18.0f)
                curveTo(10.75f, 18.4142f, 10.4142f, 18.75f, 10.0f, 18.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 18.75f, 2.25f, 18.4142f, 2.25f, 18.0f)
                close()
            }
        }
            .build()
        return _listHeart!!
    }

private var _listHeart: ImageVector? = null
