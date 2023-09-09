package com.chiksmedina.solar.boldduotone.school

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.SchoolGroup

public val SchoolGroup.NotebookSquare: ImageVector
    get() {
        if (_notebookSquare != null) {
            return _notebookSquare!!
        }
        _notebookSquare = Builder(name = "NotebookSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 9.0f)
                curveTo(2.0f, 5.2288f, 2.0f, 3.3431f, 3.1716f, 2.1716f)
                curveTo(4.3432f, 1.0f, 6.2288f, 1.0f, 10.0f, 1.0f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 1.0f, 19.6569f, 1.0f, 20.8284f, 2.1716f)
                curveTo(22.0f, 3.3431f, 22.0f, 5.2288f, 22.0f, 9.0f)
                verticalLineTo(13.0f)
                curveTo(22.0f, 16.7712f, 22.0f, 18.6569f, 20.8284f, 19.8284f)
                curveTo(19.6569f, 21.0f, 17.7712f, 21.0f, 14.0f, 21.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 21.0f, 4.3432f, 21.0f, 3.1716f, 19.8284f)
                curveTo(2.0f, 18.6569f, 2.0f, 16.7712f, 2.0f, 13.0f)
                verticalLineTo(9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 12.9108f)
                verticalLineTo(7.4965f)
                curveTo(6.0f, 6.6725f, 6.6654f, 6.0007f, 7.4872f, 6.0609f)
                curveTo(7.9997f, 6.0984f, 8.5559f, 6.1623f, 9.0f, 6.2708f)
                curveTo(9.8239f, 6.4721f, 10.851f, 6.9711f, 11.4646f, 7.2932f)
                curveTo(11.4763f, 7.2993f, 11.4881f, 7.3053f, 11.5f, 7.3109f)
                verticalLineTo(15.7262f)
                curveTo(11.4975f, 15.7249f, 11.495f, 15.7236f, 11.4926f, 15.7223f)
                curveTo(10.8826f, 15.4009f, 9.8365f, 14.8896f, 9.0f, 14.6852f)
                curveTo(8.5625f, 14.5783f, 8.0161f, 14.5147f, 7.5099f, 14.477f)
                curveTo(6.6793f, 14.4151f, 6.0f, 13.7437f, 6.0f, 12.9108f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 15.7262f)
                curveTo(12.5025f, 15.7249f, 12.505f, 15.7236f, 12.5074f, 15.7223f)
                curveTo(13.1174f, 15.4009f, 14.1634f, 14.8896f, 15.0f, 14.6852f)
                curveTo(15.4375f, 14.5783f, 15.9839f, 14.5147f, 16.4901f, 14.477f)
                curveTo(17.3207f, 14.4151f, 18.0f, 13.7437f, 18.0f, 12.9108f)
                verticalLineTo(7.4515f)
                curveTo(18.0f, 6.6454f, 17.3619f, 5.9822f, 16.5568f, 6.0217f)
                curveTo(15.9405f, 6.052f, 15.2404f, 6.121f, 14.7f, 6.2708f)
                curveTo(13.9685f, 6.4736f, 13.0752f, 6.9503f, 12.5219f, 7.2704f)
                curveTo(12.5147f, 7.2746f, 12.5073f, 7.2787f, 12.5f, 7.2828f)
                verticalLineTo(15.7262f)
                close()
            }
        }
        .build()
        return _notebookSquare!!
    }

private var _notebookSquare: ImageVector? = null
