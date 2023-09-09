package com.chiksmedina.solar.broken.list

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
import com.chiksmedina.solar.broken.ListGroup

public val ListGroup.ListHeart: ImageVector
    get() {
        if (_listHeart != null) {
            return _listHeart!!
        }
        _listHeart = Builder(name = "ListHeart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5203f, 18.3408f)
                lineTo(16.0758f, 18.9449f)
                lineTo(16.0758f, 18.9449f)
                lineTo(16.5203f, 18.3408f)
                close()
                moveTo(17.5f, 13.8296f)
                lineTo(16.9737f, 14.364f)
                curveTo(17.2657f, 14.6515f, 17.7343f, 14.6515f, 18.0263f, 14.364f)
                lineTo(17.5f, 13.8296f)
                close()
                moveTo(18.4797f, 18.3408f)
                lineTo(18.0351f, 17.7367f)
                lineTo(18.0351f, 17.7367f)
                lineTo(18.4797f, 18.3408f)
                close()
                moveTo(17.5f, 18.8201f)
                lineTo(17.5f, 19.5701f)
                lineTo(17.5f, 18.8201f)
                close()
                moveTo(16.9649f, 17.7367f)
                curveTo(16.4677f, 17.3709f, 15.8871f, 16.891f, 15.4382f, 16.374f)
                curveTo(14.9683f, 15.8329f, 14.75f, 15.3733f, 14.75f, 15.0361f)
                horizontalLineTo(13.25f)
                curveTo(13.25f, 15.9337f, 13.7742f, 16.7455f, 14.3056f, 17.3575f)
                curveTo(14.858f, 17.9937f, 15.5376f, 18.5488f, 16.0758f, 18.9449f)
                lineTo(16.9649f, 17.7367f)
                close()
                moveTo(14.75f, 15.0361f)
                curveTo(14.75f, 14.2796f, 15.0929f, 13.9195f, 15.4138f, 13.8038f)
                curveTo(15.7508f, 13.6823f, 16.3333f, 13.7332f, 16.9737f, 14.364f)
                lineTo(18.0263f, 13.2953f)
                curveTo(17.0918f, 12.3749f, 15.9243f, 12.0252f, 14.905f, 12.3927f)
                curveTo(13.8697f, 12.766f, 13.25f, 13.7847f, 13.25f, 15.0361f)
                horizontalLineTo(14.75f)
                close()
                moveTo(18.9242f, 18.9449f)
                curveTo(19.4624f, 18.5488f, 20.142f, 17.9937f, 20.6944f, 17.3575f)
                curveTo(21.2258f, 16.7455f, 21.75f, 15.9337f, 21.75f, 15.0361f)
                horizontalLineTo(20.25f)
                curveTo(20.25f, 15.3733f, 20.0317f, 15.8329f, 19.5618f, 16.374f)
                curveTo(19.1129f, 16.891f, 18.5323f, 17.3709f, 18.0351f, 17.7367f)
                lineTo(18.9242f, 18.9449f)
                close()
                moveTo(21.75f, 15.0361f)
                curveTo(21.75f, 13.7847f, 21.1303f, 12.766f, 20.095f, 12.3927f)
                curveTo(19.0757f, 12.0252f, 17.9082f, 12.3749f, 16.9737f, 13.2953f)
                lineTo(18.0263f, 14.364f)
                curveTo(18.6667f, 13.7332f, 19.2492f, 13.6823f, 19.5862f, 13.8038f)
                curveTo(19.9071f, 13.9195f, 20.25f, 14.2796f, 20.25f, 15.0361f)
                horizontalLineTo(21.75f)
                close()
                moveTo(16.0758f, 18.9449f)
                curveTo(16.4541f, 19.2232f, 16.8783f, 19.5701f, 17.5f, 19.5701f)
                lineTo(17.5f, 18.0701f)
                curveTo(17.4796f, 18.0701f, 17.4637f, 18.071f, 17.4032f, 18.0387f)
                curveTo(17.3121f, 17.99f, 17.1982f, 17.9084f, 16.9649f, 17.7367f)
                lineTo(16.0758f, 18.9449f)
                close()
                moveTo(18.0351f, 17.7367f)
                curveTo(17.8019f, 17.9084f, 17.688f, 17.99f, 17.5968f, 18.0387f)
                curveTo(17.5363f, 18.071f, 17.5204f, 18.0701f, 17.5f, 18.0701f)
                lineTo(17.5f, 19.5701f)
                curveTo(18.1217f, 19.5701f, 18.5459f, 19.2232f, 18.9242f, 18.9449f)
                lineTo(18.0351f, 17.7367f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 14.0f)
                horizontalLineTo(3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 18.0f)
                horizontalLineTo(3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 6.0f)
                lineTo(13.5f, 6.0f)
                moveTo(20.0f, 6.0f)
                lineTo(17.75f, 6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 10.0f)
                lineTo(9.5f, 10.0f)
                moveTo(3.0f, 10.0f)
                horizontalLineTo(5.25f)
            }
        }
        .build()
        return _listHeart!!
    }

private var _listHeart: ImageVector? = null
