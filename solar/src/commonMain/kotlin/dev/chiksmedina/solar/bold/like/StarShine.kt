package dev.chiksmedina.solar.bold.like

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
import dev.chiksmedina.solar.bold.LikeGroup

val LikeGroup.StarShine: ImageVector
    get() {
        if (_starShine != null) {
            return _starShine!!
        }
        _starShine = Builder(
            name = "StarShine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.5766f, 8.7042f)
                curveTo(11.2099f, 7.5681f, 11.5266f, 7.0f, 12.0f, 7.0f)
                curveTo(12.4734f, 7.0f, 12.7901f, 7.5681f, 13.4234f, 8.7042f)
                lineTo(13.5873f, 8.9981f)
                curveTo(13.7672f, 9.321f, 13.8572f, 9.4824f, 13.9975f, 9.5889f)
                curveTo(14.1378f, 9.6954f, 14.3126f, 9.735f, 14.6621f, 9.814f)
                lineTo(14.9802f, 9.886f)
                curveTo(16.2101f, 10.1643f, 16.825f, 10.3034f, 16.9713f, 10.7739f)
                curveTo(17.1176f, 11.2443f, 16.6984f, 11.7345f, 15.86f, 12.715f)
                lineTo(15.643f, 12.9686f)
                curveTo(15.4048f, 13.2472f, 15.2857f, 13.3865f, 15.2321f, 13.5589f)
                curveTo(15.1785f, 13.7312f, 15.1965f, 13.9171f, 15.2325f, 14.2888f)
                lineTo(15.2653f, 14.6272f)
                curveTo(15.3921f, 15.9353f, 15.4554f, 16.5894f, 15.0724f, 16.8801f)
                curveTo(14.6894f, 17.1709f, 14.1137f, 16.9058f, 12.9622f, 16.3756f)
                lineTo(12.6643f, 16.2384f)
                curveTo(12.337f, 16.0878f, 12.1734f, 16.0124f, 12.0f, 16.0124f)
                curveTo(11.8266f, 16.0124f, 11.663f, 16.0878f, 11.3357f, 16.2384f)
                lineTo(11.0378f, 16.3756f)
                curveTo(9.8863f, 16.9058f, 9.3106f, 17.1709f, 8.9276f, 16.8801f)
                curveTo(8.5446f, 16.5894f, 8.6079f, 15.9353f, 8.7347f, 14.6272f)
                lineTo(8.7675f, 14.2888f)
                curveTo(8.8035f, 13.9171f, 8.8215f, 13.7312f, 8.7679f, 13.5589f)
                curveTo(8.7143f, 13.3865f, 8.5952f, 13.2472f, 8.357f, 12.9686f)
                lineTo(8.14f, 12.715f)
                curveTo(7.3016f, 11.7345f, 6.8824f, 11.2443f, 7.0287f, 10.7739f)
                curveTo(7.175f, 10.3034f, 7.7899f, 10.1643f, 9.0198f, 9.886f)
                lineTo(9.3379f, 9.814f)
                curveTo(9.6874f, 9.735f, 9.8622f, 9.6954f, 10.0025f, 9.5889f)
                curveTo(10.1428f, 9.4824f, 10.2328f, 9.321f, 10.4127f, 8.9981f)
                lineTo(10.5766f, 8.7042f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 1.25f)
                curveTo(12.4142f, 1.25f, 12.75f, 1.5858f, 12.75f, 2.0f)
                verticalLineTo(4.0f)
                curveTo(12.75f, 4.4142f, 12.4142f, 4.75f, 12.0f, 4.75f)
                curveTo(11.5858f, 4.75f, 11.25f, 4.4142f, 11.25f, 4.0f)
                verticalLineTo(2.0f)
                curveTo(11.25f, 1.5858f, 11.5858f, 1.25f, 12.0f, 1.25f)
                close()
                moveTo(18.5304f, 5.4696f)
                curveTo(18.8233f, 5.7625f, 18.8233f, 6.2373f, 18.5304f, 6.5302f)
                lineTo(18.1872f, 6.8735f)
                curveTo(17.8943f, 7.1664f, 17.4194f, 7.1664f, 17.1265f, 6.8735f)
                curveTo(16.8336f, 6.5806f, 16.8336f, 6.1057f, 17.1265f, 5.8128f)
                lineTo(17.4698f, 5.4696f)
                curveTo(17.7627f, 5.1767f, 18.2376f, 5.1767f, 18.5304f, 5.4696f)
                close()
                moveTo(5.4697f, 5.4697f)
                curveTo(5.7626f, 5.1768f, 6.2374f, 5.1768f, 6.5303f, 5.4697f)
                lineTo(6.8736f, 5.8129f)
                curveTo(7.1665f, 6.1058f, 7.1665f, 6.5807f, 6.8736f, 6.8736f)
                curveTo(6.5807f, 7.1665f, 6.1058f, 7.1665f, 5.8129f, 6.8736f)
                lineTo(5.4697f, 6.5303f)
                curveTo(5.1768f, 6.2374f, 5.1768f, 5.7626f, 5.4697f, 5.4697f)
                close()
                moveTo(1.25f, 12.0f)
                curveTo(1.25f, 11.5858f, 1.5858f, 11.25f, 2.0f, 11.25f)
                horizontalLineTo(4.0f)
                curveTo(4.4142f, 11.25f, 4.75f, 11.5858f, 4.75f, 12.0f)
                curveTo(4.75f, 12.4142f, 4.4142f, 12.75f, 4.0f, 12.75f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 12.75f, 1.25f, 12.4142f, 1.25f, 12.0f)
                close()
                moveTo(19.25f, 12.0f)
                curveTo(19.25f, 11.5858f, 19.5858f, 11.25f, 20.0f, 11.25f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 11.25f, 22.75f, 11.5858f, 22.75f, 12.0f)
                curveTo(22.75f, 12.4142f, 22.4142f, 12.75f, 22.0f, 12.75f)
                horizontalLineTo(20.0f)
                curveTo(19.5858f, 12.75f, 19.25f, 12.4142f, 19.25f, 12.0f)
                close()
                moveTo(6.8735f, 17.1265f)
                curveTo(7.1664f, 17.4194f, 7.1664f, 17.8943f, 6.8735f, 18.1872f)
                lineTo(6.5304f, 18.5302f)
                curveTo(6.2375f, 18.8231f, 5.7627f, 18.8231f, 5.4698f, 18.5302f)
                curveTo(5.1769f, 18.2373f, 5.1769f, 17.7625f, 5.4698f, 17.4696f)
                lineTo(5.8128f, 17.1265f)
                curveTo(6.1057f, 16.8336f, 6.5806f, 16.8336f, 6.8735f, 17.1265f)
                close()
                moveTo(17.1265f, 17.1267f)
                curveTo(17.4194f, 16.8339f, 17.8943f, 16.8339f, 18.1872f, 17.1267f)
                lineTo(18.5302f, 17.4698f)
                curveTo(18.8231f, 17.7627f, 18.8231f, 18.2376f, 18.5302f, 18.5305f)
                curveTo(18.2373f, 18.8233f, 17.7624f, 18.8233f, 17.4695f, 18.5305f)
                lineTo(17.1265f, 18.1874f)
                curveTo(16.8336f, 17.8945f, 16.8336f, 17.4196f, 17.1265f, 17.1267f)
                close()
                moveTo(12.0f, 19.25f)
                curveTo(12.4142f, 19.25f, 12.75f, 19.5858f, 12.75f, 20.0f)
                verticalLineTo(22.0f)
                curveTo(12.75f, 22.4142f, 12.4142f, 22.75f, 12.0f, 22.75f)
                curveTo(11.5858f, 22.75f, 11.25f, 22.4142f, 11.25f, 22.0f)
                verticalLineTo(20.0f)
                curveTo(11.25f, 19.5858f, 11.5858f, 19.25f, 12.0f, 19.25f)
                close()
            }
        }
            .build()
        return _starShine!!
    }

private var _starShine: ImageVector? = null
