package dev.chiksmedina.solar.boldduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.EssentionalUiGroup

val EssentionalUiGroup.FerrisWheel: ImageVector
    get() {
        if (_ferrisWheel != null) {
            return _ferrisWheel!!
        }
        _ferrisWheel = Builder(
            name = "FerrisWheel", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(9.25f, 11.0f)
                curveTo(9.25f, 9.4812f, 10.4812f, 8.25f, 12.0f, 8.25f)
                curveTo(13.5188f, 8.25f, 14.75f, 9.4812f, 14.75f, 11.0f)
                curveTo(14.75f, 12.5188f, 13.5188f, 13.75f, 12.0f, 13.75f)
                curveTo(10.4812f, 13.75f, 9.25f, 12.5188f, 9.25f, 11.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.8211f, 12.678f)
                lineTo(4.8445f, 21.6359f)
                curveTo(4.6434f, 21.998f, 4.7738f, 22.4546f, 5.1359f, 22.6557f)
                curveTo(5.498f, 22.8569f, 5.9546f, 22.7264f, 6.1557f, 22.3644f)
                lineTo(11.0377f, 13.5769f)
                curveTo(10.5524f, 13.3956f, 10.1321f, 13.0812f, 9.8211f, 12.678f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.9626f, 13.5768f)
                lineTo(17.8445f, 22.3644f)
                curveTo(18.0457f, 22.7264f, 18.5023f, 22.8569f, 18.8644f, 22.6557f)
                curveTo(19.2265f, 22.4546f, 19.3569f, 21.998f, 19.1558f, 21.6359f)
                lineTo(14.179f, 12.6778f)
                curveTo(13.8681f, 13.081f, 13.4478f, 13.3955f, 12.9626f, 13.5768f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 5.25f)
                curveTo(11.0335f, 5.25f, 10.25f, 4.4665f, 10.25f, 3.5f)
                curveTo(10.25f, 2.5335f, 11.0335f, 1.75f, 12.0f, 1.75f)
                curveTo(12.9665f, 1.75f, 13.75f, 2.5335f, 13.75f, 3.5f)
                curveTo(13.75f, 4.4665f, 12.9665f, 5.25f, 12.0f, 5.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.75f, 7.5f)
                curveTo(2.75f, 6.5335f, 3.5335f, 5.75f, 4.5f, 5.75f)
                curveTo(5.4665f, 5.75f, 6.25f, 6.5335f, 6.25f, 7.5f)
                curveTo(6.25f, 8.4665f, 5.4665f, 9.25f, 4.5f, 9.25f)
                curveTo(3.5335f, 9.25f, 2.75f, 8.4665f, 2.75f, 7.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.5f, 5.75f)
                curveTo(18.5335f, 5.75f, 17.75f, 6.5335f, 17.75f, 7.5f)
                curveTo(17.75f, 8.4665f, 18.5335f, 9.25f, 19.5f, 9.25f)
                curveTo(20.4665f, 9.25f, 21.25f, 8.4665f, 21.25f, 7.5f)
                curveTo(21.25f, 6.5335f, 20.4665f, 5.75f, 19.5f, 5.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.5f, 14.25f)
                curveTo(18.5335f, 14.25f, 17.75f, 15.0335f, 17.75f, 16.0f)
                curveTo(17.75f, 16.9665f, 18.5335f, 17.75f, 19.5f, 17.75f)
                curveTo(20.4665f, 17.75f, 21.25f, 16.9665f, 21.25f, 16.0f)
                curveTo(21.25f, 15.0335f, 20.4665f, 14.25f, 19.5f, 14.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(4.5f, 14.25f)
                curveTo(3.5335f, 14.25f, 2.75f, 15.0335f, 2.75f, 16.0f)
                curveTo(2.75f, 16.9665f, 3.5335f, 17.75f, 4.5f, 17.75f)
                curveTo(5.4665f, 17.75f, 6.25f, 16.9665f, 6.25f, 16.0f)
                curveTo(6.25f, 15.0335f, 5.4665f, 14.25f, 4.5f, 14.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.25f, 19.5f)
                curveTo(10.25f, 20.4665f, 11.0335f, 21.25f, 12.0f, 21.25f)
                curveTo(12.9665f, 21.25f, 13.75f, 20.4665f, 13.75f, 19.5f)
                curveTo(13.75f, 18.5335f, 12.9665f, 17.75f, 12.0f, 17.75f)
                curveTo(11.0335f, 17.75f, 10.25f, 18.5335f, 10.25f, 19.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(10.6366f, 4.5972f)
                curveTo(10.3948f, 4.2971f, 10.25f, 3.9155f, 10.25f, 3.5f)
                curveTo(10.25f, 3.3526f, 10.2682f, 3.2095f, 10.3025f, 3.0728f)
                curveTo(10.2695f, 3.0896f, 10.2367f, 3.1068f, 10.2041f, 3.1246f)
                lineTo(5.4098f, 5.7388f)
                curveTo(5.3273f, 5.7838f, 5.2468f, 5.8317f, 5.1686f, 5.8822f)
                curveTo(5.6601f, 6.0856f, 6.0388f, 6.5064f, 6.1847f, 7.0248f)
                lineTo(10.6366f, 4.5972f)
                close()
                moveTo(4.9551f, 9.1902f)
                curveTo(4.81f, 9.2292f, 4.6574f, 9.25f, 4.5f, 9.25f)
                curveTo(4.1093f, 9.25f, 3.7484f, 9.1219f, 3.4572f, 8.9055f)
                curveTo(3.4558f, 8.9473f, 3.4551f, 8.9892f, 3.4551f, 9.0311f)
                verticalLineTo(13.9688f)
                curveTo(3.4551f, 14.1694f, 3.4711f, 14.3677f, 3.5022f, 14.5621f)
                curveTo(3.7853f, 14.3653f, 4.1292f, 14.25f, 4.5f, 14.25f)
                curveTo(4.6672f, 14.25f, 4.829f, 14.2734f, 4.9822f, 14.3173f)
                curveTo(4.9643f, 14.203f, 4.9551f, 14.0866f, 4.9551f, 13.9688f)
                verticalLineTo(9.1902f)
                close()
                moveTo(6.25f, 16.0107f)
                curveTo(6.2467f, 16.5574f, 5.9927f, 17.0447f, 5.5973f, 17.3633f)
                lineTo(10.2041f, 19.8753f)
                curveTo(10.2367f, 19.8931f, 10.2695f, 19.9104f, 10.3025f, 19.9271f)
                curveTo(10.2682f, 19.7904f, 10.25f, 19.6473f, 10.25f, 19.5f)
                curveTo(10.25f, 19.0845f, 10.3948f, 18.7028f, 10.6367f, 18.4027f)
                lineTo(6.25f, 16.0107f)
                close()
                moveTo(13.3629f, 18.4022f)
                curveTo(13.605f, 18.7024f, 13.75f, 19.0843f, 13.75f, 19.5f)
                curveTo(13.75f, 19.647f, 13.7319f, 19.7898f, 13.6977f, 19.9263f)
                curveTo(13.7302f, 19.9098f, 13.7625f, 19.8928f, 13.7945f, 19.8753f)
                lineTo(18.4022f, 17.3629f)
                curveTo(18.0068f, 17.044f, 17.7531f, 16.5567f, 17.75f, 16.01f)
                lineTo(13.3629f, 18.4022f)
                close()
                moveTo(19.0164f, 14.3177f)
                curveTo(19.17f, 14.2736f, 19.3322f, 14.25f, 19.5f, 14.25f)
                curveTo(19.8703f, 14.25f, 20.2137f, 14.365f, 20.4965f, 14.5612f)
                curveTo(20.5276f, 14.3671f, 20.5435f, 14.1691f, 20.5435f, 13.9688f)
                verticalLineTo(9.0311f)
                curveTo(20.5435f, 8.9895f, 20.5428f, 8.9479f, 20.5415f, 8.9065f)
                curveTo(20.2505f, 9.1223f, 19.8901f, 9.25f, 19.5f, 9.25f)
                curveTo(19.3421f, 9.25f, 19.1891f, 9.2291f, 19.0435f, 9.1898f)
                verticalLineTo(13.9688f)
                curveTo(19.0435f, 14.0867f, 19.0343f, 14.2033f, 19.0164f, 14.3177f)
                close()
                moveTo(17.8151f, 7.0254f)
                curveTo(17.9608f, 6.5071f, 18.3392f, 6.0862f, 18.8305f, 5.8826f)
                curveTo(18.7522f, 5.8319f, 18.6715f, 5.7839f, 18.5888f, 5.7388f)
                lineTo(13.7945f, 3.1246f)
                curveTo(13.7625f, 3.1071f, 13.7302f, 3.0901f, 13.6977f, 3.0736f)
                curveTo(13.7319f, 3.2101f, 13.75f, 3.3529f, 13.75f, 3.5f)
                curveTo(13.75f, 3.9157f, 13.605f, 4.2976f, 13.3629f, 4.5978f)
                lineTo(17.8151f, 7.0254f)
                close()
            }
        }
            .build()
        return _ferrisWheel!!
    }

private var _ferrisWheel: ImageVector? = null
