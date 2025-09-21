package dev.chiksmedina.solar.outline.naturetravel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.NatureTravelGroup

val NatureTravelGroup.Leaf: ImageVector
    get() {
        if (_leaf != null) {
            return _leaf!!
        }
        _leaf = Builder(
            name = "Leaf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.2195f, 1.6461f)
                curveTo(10.7841f, 1.3822f, 11.3919f, 1.25f, 12.0f, 1.25f)
                curveTo(12.6081f, 1.25f, 13.2159f, 1.3822f, 13.7805f, 1.6461f)
                curveTo(15.9556f, 2.6628f, 17.6944f, 4.5669f, 18.8844f, 6.7581f)
                curveTo(20.076f, 8.9521f, 20.75f, 11.4916f, 20.75f, 13.8567f)
                curveTo(20.75f, 18.7557f, 16.845f, 22.75f, 12.0f, 22.75f)
                curveTo(7.155f, 22.75f, 3.25f, 18.7557f, 3.25f, 13.8567f)
                curveTo(3.25f, 11.4916f, 3.924f, 8.9521f, 5.1156f, 6.7581f)
                curveTo(6.3056f, 4.5669f, 8.0444f, 2.6628f, 10.2195f, 1.6461f)
                close()
                moveTo(11.25f, 2.8564f)
                curveTo(11.1157f, 2.8953f, 10.9835f, 2.9448f, 10.8546f, 3.005f)
                curveTo(9.046f, 3.8504f, 7.5162f, 5.4808f, 6.4337f, 7.474f)
                curveTo(5.3526f, 9.4646f, 4.75f, 11.7596f, 4.75f, 13.8567f)
                curveTo(4.75f, 17.6927f, 7.6082f, 20.8285f, 11.25f, 21.2108f)
                verticalLineTo(2.8564f)
                close()
                moveTo(12.75f, 2.8564f)
                verticalLineTo(7.1893f)
                lineTo(15.378f, 4.5614f)
                curveTo(14.6988f, 3.9121f, 13.9496f, 3.3809f, 13.1454f, 3.005f)
                curveTo(13.0165f, 2.9448f, 12.8843f, 2.8953f, 12.75f, 2.8564f)
                close()
                moveTo(16.3862f, 5.6744f)
                lineTo(12.75f, 9.3107f)
                verticalLineTo(12.6893f)
                lineTo(17.7044f, 7.735f)
                curveTo(17.6593f, 7.6474f, 17.6132f, 7.5604f, 17.5663f, 7.474f)
                curveTo(17.2175f, 6.8318f, 16.8223f, 6.2272f, 16.3862f, 5.6744f)
                close()
                moveTo(18.3577f, 9.2029f)
                lineTo(12.75f, 14.8107f)
                verticalLineTo(17.6893f)
                lineTo(18.9696f, 11.4697f)
                lineTo(19.0175f, 11.5176f)
                curveTo(18.8669f, 10.7404f, 18.6451f, 9.9612f, 18.3577f, 9.2029f)
                close()
                moveTo(19.2373f, 13.3234f)
                lineTo(12.75f, 19.8107f)
                verticalLineTo(21.2108f)
                curveTo(16.3918f, 20.8285f, 19.25f, 17.6927f, 19.25f, 13.8567f)
                curveTo(19.25f, 13.6802f, 19.2457f, 13.5024f, 19.2373f, 13.3234f)
                close()
            }
        }
            .build()
        return _leaf!!
    }

private var _leaf: ImageVector? = null
