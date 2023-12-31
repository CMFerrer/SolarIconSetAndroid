package com.chiksmedina.solar.lineduotone.school

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.SchoolGroup

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
                moveTo(16.5568f, 6.0217f)
                lineTo(16.52f, 5.2726f)
                lineTo(16.52f, 5.2726f)
                lineTo(16.5568f, 6.0217f)
                close()
                moveTo(14.7f, 6.2708f)
                lineTo(14.4997f, 5.548f)
                lineTo(14.4997f, 5.548f)
                lineTo(14.7f, 6.2708f)
                close()
                moveTo(12.5219f, 7.2704f)
                lineTo(12.1463f, 6.6213f)
                lineTo(12.1463f, 6.6213f)
                lineTo(12.5219f, 7.2704f)
                close()
                moveTo(7.4872f, 6.0609f)
                lineTo(7.4324f, 6.8089f)
                lineTo(7.4872f, 6.0609f)
                close()
                moveTo(9.0f, 6.2708f)
                lineTo(8.822f, 6.9994f)
                lineTo(8.822f, 6.9994f)
                lineTo(9.0f, 6.2708f)
                close()
                moveTo(11.4646f, 7.2932f)
                lineTo(11.116f, 7.9573f)
                lineTo(11.116f, 7.9573f)
                lineTo(11.4646f, 7.2932f)
                close()
                moveTo(12.5074f, 15.7223f)
                lineTo(12.857f, 16.3858f)
                lineTo(12.857f, 16.3858f)
                lineTo(12.5074f, 15.7223f)
                close()
                moveTo(15.0f, 14.6852f)
                lineTo(14.822f, 13.9566f)
                lineTo(14.822f, 13.9566f)
                lineTo(15.0f, 14.6852f)
                close()
                moveTo(16.4901f, 14.477f)
                lineTo(16.5459f, 15.2249f)
                lineTo(16.5459f, 15.2249f)
                lineTo(16.4901f, 14.477f)
                close()
                moveTo(11.4926f, 15.7223f)
                lineTo(11.143f, 16.3858f)
                lineTo(11.143f, 16.3858f)
                lineTo(11.4926f, 15.7223f)
                close()
                moveTo(9.0f, 14.6852f)
                lineTo(9.178f, 13.9566f)
                lineTo(9.178f, 13.9566f)
                lineTo(9.0f, 14.6852f)
                close()
                moveTo(7.5099f, 14.477f)
                lineTo(7.4541f, 15.2249f)
                lineTo(7.4541f, 15.2249f)
                lineTo(7.5099f, 14.477f)
                close()
                moveTo(6.75f, 12.9108f)
                verticalLineTo(7.4965f)
                horizontalLineTo(5.25f)
                verticalLineTo(12.9108f)
                horizontalLineTo(6.75f)
                close()
                moveTo(18.75f, 12.9108f)
                verticalLineTo(7.4515f)
                horizontalLineTo(17.25f)
                verticalLineTo(12.9108f)
                horizontalLineTo(18.75f)
                close()
                moveTo(16.52f, 5.2726f)
                curveTo(15.8904f, 5.3035f, 15.1227f, 5.3753f, 14.4997f, 5.548f)
                lineTo(14.9003f, 6.9935f)
                curveTo(15.3582f, 6.8666f, 15.9907f, 6.8004f, 16.5935f, 6.7708f)
                lineTo(16.52f, 5.2726f)
                close()
                moveTo(14.4997f, 5.548f)
                curveTo(13.6675f, 5.7787f, 12.7018f, 6.2998f, 12.1463f, 6.6213f)
                lineTo(12.8975f, 7.9196f)
                curveTo(13.4487f, 7.6007f, 14.2696f, 7.1684f, 14.9003f, 6.9935f)
                lineTo(14.4997f, 5.548f)
                close()
                moveTo(7.4324f, 6.8089f)
                curveTo(7.9319f, 6.8455f, 8.439f, 6.9058f, 8.822f, 6.9994f)
                lineTo(9.178f, 5.5422f)
                curveTo(8.6729f, 5.4188f, 8.0674f, 5.3514f, 7.5419f, 5.3129f)
                lineTo(7.4324f, 6.8089f)
                close()
                moveTo(8.822f, 6.9994f)
                curveTo(9.548f, 7.1768f, 10.5035f, 7.6357f, 11.116f, 7.9573f)
                lineTo(11.8132f, 6.6291f)
                curveTo(11.1985f, 6.3065f, 10.0998f, 5.7674f, 9.178f, 5.5422f)
                lineTo(8.822f, 6.9994f)
                close()
                moveTo(12.857f, 16.3858f)
                curveTo(13.4666f, 16.0647f, 14.4402f, 15.594f, 15.178f, 15.4138f)
                lineTo(14.822f, 13.9566f)
                curveTo(13.8867f, 14.1851f, 12.7683f, 14.7371f, 12.1578f, 15.0588f)
                lineTo(12.857f, 16.3858f)
                close()
                moveTo(15.178f, 15.4138f)
                curveTo(15.5551f, 15.3216f, 16.0529f, 15.2617f, 16.5459f, 15.2249f)
                lineTo(16.4343f, 13.7291f)
                curveTo(15.9149f, 13.7678f, 15.3199f, 13.835f, 14.822f, 13.9566f)
                lineTo(15.178f, 15.4138f)
                close()
                moveTo(11.8422f, 15.0588f)
                curveTo(11.2317f, 14.7371f, 10.1133f, 14.1851f, 9.178f, 13.9566f)
                lineTo(8.822f, 15.4138f)
                curveTo(9.5598f, 15.594f, 10.5334f, 16.0647f, 11.143f, 16.3858f)
                lineTo(11.8422f, 15.0588f)
                close()
                moveTo(9.178f, 13.9566f)
                curveTo(8.6801f, 13.835f, 8.0851f, 13.7678f, 7.5657f, 13.7291f)
                lineTo(7.4541f, 15.2249f)
                curveTo(7.9471f, 15.2617f, 8.4449f, 15.3216f, 8.822f, 15.4138f)
                lineTo(9.178f, 13.9566f)
                close()
                moveTo(17.25f, 12.9108f)
                curveTo(17.25f, 13.3157f, 16.9097f, 13.6936f, 16.4343f, 13.7291f)
                lineTo(16.5459f, 15.2249f)
                curveTo(17.7316f, 15.1365f, 18.75f, 14.1716f, 18.75f, 12.9108f)
                horizontalLineTo(17.25f)
                close()
                moveTo(18.75f, 7.4515f)
                curveTo(18.75f, 6.2569f, 17.7923f, 5.2101f, 16.52f, 5.2726f)
                lineTo(16.5935f, 6.7708f)
                curveTo(16.9314f, 6.7542f, 17.25f, 7.0339f, 17.25f, 7.4515f)
                horizontalLineTo(18.75f)
                close()
                moveTo(5.25f, 12.9108f)
                curveTo(5.25f, 14.1716f, 6.2684f, 15.1365f, 7.4541f, 15.2249f)
                lineTo(7.5657f, 13.7291f)
                curveTo(7.0903f, 13.6936f, 6.75f, 13.3157f, 6.75f, 12.9108f)
                horizontalLineTo(5.25f)
                close()
                moveTo(12.1578f, 15.0588f)
                curveTo(12.0598f, 15.1104f, 11.9402f, 15.1104f, 11.8422f, 15.0588f)
                lineTo(11.143f, 16.3858f)
                curveTo(11.6786f, 16.6681f, 12.3214f, 16.6681f, 12.857f, 16.3858f)
                lineTo(12.1578f, 15.0588f)
                close()
                moveTo(12.1463f, 6.6213f)
                curveTo(12.0434f, 6.6808f, 11.9157f, 6.6829f, 11.8132f, 6.6291f)
                lineTo(11.116f, 7.9573f)
                curveTo(11.6772f, 8.2518f, 12.3517f, 8.2354f, 12.8975f, 7.9196f)
                lineTo(12.1463f, 6.6213f)
                close()
                moveTo(6.75f, 7.4965f)
                curveTo(6.75f, 7.0697f, 7.0828f, 6.7833f, 7.4324f, 6.8089f)
                lineTo(7.5419f, 5.3129f)
                curveTo(6.248f, 5.2182f, 5.25f, 6.2753f, 5.25f, 7.4965f)
                horizontalLineTo(6.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 7.5855f)
                verticalLineTo(15.9998f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
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
        }
            .build()
        return _notebookSquare!!
    }

private var _notebookSquare: ImageVector? = null
