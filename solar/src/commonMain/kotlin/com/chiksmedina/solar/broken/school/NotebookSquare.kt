package com.chiksmedina.solar.broken.school

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
import com.chiksmedina.solar.broken.SchoolGroup

val SchoolGroup.NotebookSquare: ImageVector
    get() {
        if (_notebookSquare != null) {
            return _notebookSquare!!
        }
        _notebookSquare = Builder(
            name = "NotebookSquare", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.5568f, 7.0217f)
                lineTo(16.52f, 6.2726f)
                lineTo(16.52f, 6.2726f)
                lineTo(16.5568f, 7.0217f)
                close()
                moveTo(14.7f, 7.2708f)
                lineTo(14.4997f, 6.548f)
                lineTo(14.4997f, 6.548f)
                lineTo(14.7f, 7.2708f)
                close()
                moveTo(12.5219f, 8.2704f)
                lineTo(12.1463f, 7.6213f)
                lineTo(12.1463f, 7.6213f)
                lineTo(12.5219f, 8.2704f)
                close()
                moveTo(7.4872f, 7.0609f)
                lineTo(7.4324f, 7.8089f)
                lineTo(7.4872f, 7.0609f)
                close()
                moveTo(9.0f, 7.2708f)
                lineTo(8.822f, 7.9994f)
                lineTo(8.822f, 7.9994f)
                lineTo(9.0f, 7.2708f)
                close()
                moveTo(11.4646f, 8.2932f)
                lineTo(11.116f, 8.9572f)
                lineTo(11.116f, 8.9572f)
                lineTo(11.4646f, 8.2932f)
                close()
                moveTo(12.5074f, 16.7223f)
                lineTo(12.857f, 17.3858f)
                lineTo(12.857f, 17.3858f)
                lineTo(12.5074f, 16.7223f)
                close()
                moveTo(15.0f, 15.6852f)
                lineTo(14.822f, 14.9566f)
                lineTo(14.822f, 14.9566f)
                lineTo(15.0f, 15.6852f)
                close()
                moveTo(16.4901f, 15.477f)
                lineTo(16.5459f, 16.2249f)
                lineTo(16.5459f, 16.2249f)
                lineTo(16.4901f, 15.477f)
                close()
                moveTo(11.4926f, 16.7223f)
                lineTo(11.143f, 17.3858f)
                lineTo(11.143f, 17.3858f)
                lineTo(11.4926f, 16.7223f)
                close()
                moveTo(9.0f, 15.6852f)
                lineTo(9.178f, 14.9566f)
                lineTo(9.178f, 14.9566f)
                lineTo(9.0f, 15.6852f)
                close()
                moveTo(7.5099f, 15.477f)
                lineTo(7.4541f, 16.2249f)
                lineTo(7.4541f, 16.2249f)
                lineTo(7.5099f, 15.477f)
                close()
                moveTo(6.75f, 13.9108f)
                verticalLineTo(8.4965f)
                horizontalLineTo(5.25f)
                verticalLineTo(13.9108f)
                horizontalLineTo(6.75f)
                close()
                moveTo(18.75f, 13.9108f)
                verticalLineTo(8.4515f)
                horizontalLineTo(17.25f)
                verticalLineTo(13.9108f)
                horizontalLineTo(18.75f)
                close()
                moveTo(16.52f, 6.2726f)
                curveTo(15.8904f, 6.3035f, 15.1227f, 6.3753f, 14.4997f, 6.548f)
                lineTo(14.9003f, 7.9935f)
                curveTo(15.3582f, 7.8666f, 15.9907f, 7.8004f, 16.5935f, 7.7708f)
                lineTo(16.52f, 6.2726f)
                close()
                moveTo(14.4997f, 6.548f)
                curveTo(13.6675f, 6.7787f, 12.7018f, 7.2998f, 12.1463f, 7.6213f)
                lineTo(12.8975f, 8.9196f)
                curveTo(13.4487f, 8.6007f, 14.2696f, 8.1684f, 14.9003f, 7.9935f)
                lineTo(14.4997f, 6.548f)
                close()
                moveTo(7.4324f, 7.8089f)
                curveTo(7.9319f, 7.8455f, 8.439f, 7.9058f, 8.822f, 7.9994f)
                lineTo(9.178f, 6.5422f)
                curveTo(8.6729f, 6.4188f, 8.0674f, 6.3514f, 7.5419f, 6.3129f)
                lineTo(7.4324f, 7.8089f)
                close()
                moveTo(8.822f, 7.9994f)
                curveTo(9.548f, 8.1768f, 10.5035f, 8.6357f, 11.116f, 8.9572f)
                lineTo(11.8132f, 7.6291f)
                curveTo(11.1985f, 7.3065f, 10.0998f, 6.7674f, 9.178f, 6.5422f)
                lineTo(8.822f, 7.9994f)
                close()
                moveTo(12.857f, 17.3858f)
                curveTo(13.4666f, 17.0647f, 14.4402f, 16.594f, 15.178f, 16.4138f)
                lineTo(14.822f, 14.9566f)
                curveTo(13.8867f, 15.1851f, 12.7683f, 15.7371f, 12.1578f, 16.0588f)
                lineTo(12.857f, 17.3858f)
                close()
                moveTo(15.178f, 16.4138f)
                curveTo(15.5551f, 16.3216f, 16.0529f, 16.2617f, 16.5459f, 16.2249f)
                lineTo(16.4343f, 14.7291f)
                curveTo(15.9149f, 14.7678f, 15.3199f, 14.835f, 14.822f, 14.9566f)
                lineTo(15.178f, 16.4138f)
                close()
                moveTo(11.8422f, 16.0588f)
                curveTo(11.2317f, 15.7371f, 10.1133f, 15.1851f, 9.178f, 14.9566f)
                lineTo(8.822f, 16.4138f)
                curveTo(9.5598f, 16.594f, 10.5334f, 17.0647f, 11.143f, 17.3858f)
                lineTo(11.8422f, 16.0588f)
                close()
                moveTo(9.178f, 14.9566f)
                curveTo(8.6801f, 14.835f, 8.0851f, 14.7678f, 7.5657f, 14.7291f)
                lineTo(7.4541f, 16.2249f)
                curveTo(7.9471f, 16.2617f, 8.4449f, 16.3216f, 8.822f, 16.4138f)
                lineTo(9.178f, 14.9566f)
                close()
                moveTo(17.25f, 13.9108f)
                curveTo(17.25f, 14.3157f, 16.9097f, 14.6936f, 16.4343f, 14.7291f)
                lineTo(16.5459f, 16.2249f)
                curveTo(17.7316f, 16.1365f, 18.75f, 15.1716f, 18.75f, 13.9108f)
                horizontalLineTo(17.25f)
                close()
                moveTo(18.75f, 8.4515f)
                curveTo(18.75f, 7.2569f, 17.7923f, 6.2101f, 16.52f, 6.2726f)
                lineTo(16.5935f, 7.7708f)
                curveTo(16.9314f, 7.7542f, 17.25f, 8.0339f, 17.25f, 8.4515f)
                horizontalLineTo(18.75f)
                close()
                moveTo(5.25f, 13.9108f)
                curveTo(5.25f, 15.1716f, 6.2684f, 16.1365f, 7.4541f, 16.2249f)
                lineTo(7.5657f, 14.7291f)
                curveTo(7.0903f, 14.6936f, 6.75f, 14.3157f, 6.75f, 13.9108f)
                horizontalLineTo(5.25f)
                close()
                moveTo(12.1578f, 16.0588f)
                curveTo(12.0598f, 16.1104f, 11.9402f, 16.1104f, 11.8422f, 16.0588f)
                lineTo(11.143f, 17.3858f)
                curveTo(11.6786f, 17.6681f, 12.3214f, 17.6681f, 12.857f, 17.3858f)
                lineTo(12.1578f, 16.0588f)
                close()
                moveTo(12.1463f, 7.6213f)
                curveTo(12.0434f, 7.6808f, 11.9157f, 7.6829f, 11.8132f, 7.6291f)
                lineTo(11.116f, 8.9572f)
                curveTo(11.6772f, 9.2518f, 12.3517f, 9.2354f, 12.8975f, 8.9196f)
                lineTo(12.1463f, 7.6213f)
                close()
                moveTo(6.75f, 8.4965f)
                curveTo(6.75f, 8.0697f, 7.0828f, 7.7833f, 7.4324f, 7.8089f)
                lineTo(7.5419f, 6.3129f)
                curveTo(6.248f, 6.2182f, 5.25f, 7.2753f, 5.25f, 8.4965f)
                horizontalLineTo(6.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 8.5855f)
                verticalLineTo(16.9998f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(21.5093f, 4.4382f, 21.8356f, 5.8066f, 21.9449f, 8.0f)
            }
        }
            .build()
        return _notebookSquare!!
    }

private var _notebookSquare: ImageVector? = null
