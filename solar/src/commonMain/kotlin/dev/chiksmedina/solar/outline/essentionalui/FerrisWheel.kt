package dev.chiksmedina.solar.outline.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.EssentionalUiGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(13.6976f, 3.0733f)
                curveTo(13.5071f, 2.313f, 12.8193f, 1.75f, 12.0f, 1.75f)
                curveTo(11.1807f, 1.75f, 10.4929f, 2.313f, 10.3024f, 3.0733f)
                curveTo(10.2697f, 3.0899f, 10.2371f, 3.107f, 10.2048f, 3.1247f)
                lineTo(5.4105f, 5.7388f)
                curveTo(5.3279f, 5.7839f, 5.2473f, 5.8318f, 5.1691f, 5.8825f)
                curveTo(4.9629f, 5.7971f, 4.737f, 5.75f, 4.5f, 5.75f)
                curveTo(3.5335f, 5.75f, 2.75f, 6.5335f, 2.75f, 7.5f)
                curveTo(2.75f, 8.0761f, 3.0283f, 8.5871f, 3.4579f, 8.906f)
                curveTo(3.4565f, 8.9476f, 3.4558f, 8.9894f, 3.4558f, 9.0312f)
                verticalLineTo(13.9688f)
                curveTo(3.4558f, 14.1693f, 3.4718f, 14.3674f, 3.5029f, 14.5617f)
                curveTo(3.0479f, 14.8777f, 2.75f, 15.4041f, 2.75f, 16.0f)
                curveTo(2.75f, 16.9665f, 3.5335f, 17.75f, 4.5f, 17.75f)
                curveTo(4.9156f, 17.75f, 5.2973f, 17.6051f, 5.5975f, 17.3631f)
                lineTo(6.8413f, 18.0413f)
                lineTo(4.8444f, 21.6358f)
                curveTo(4.6432f, 21.9979f, 4.7737f, 22.4545f, 5.1357f, 22.6556f)
                curveTo(5.4978f, 22.8568f, 5.9544f, 22.7263f, 6.1556f, 22.3642f)
                lineTo(8.1583f, 18.7594f)
                lineTo(10.2048f, 19.8754f)
                curveTo(10.2371f, 19.893f, 10.2697f, 19.9101f, 10.3024f, 19.9267f)
                curveTo(10.4929f, 20.687f, 11.1807f, 21.25f, 12.0f, 21.25f)
                curveTo(12.8193f, 21.25f, 13.5071f, 20.687f, 13.6976f, 19.9268f)
                curveTo(13.7303f, 19.9101f, 13.7629f, 19.893f, 13.7953f, 19.8754f)
                lineTo(15.8417f, 18.7595f)
                lineTo(17.8444f, 22.3642f)
                curveTo(18.0456f, 22.7263f, 18.5022f, 22.8568f, 18.8642f, 22.6556f)
                curveTo(19.2263f, 22.4545f, 19.3568f, 21.9979f, 19.1556f, 21.6358f)
                lineTo(17.1587f, 18.0413f)
                lineTo(18.4025f, 17.3631f)
                curveTo(18.7027f, 17.6051f, 19.0844f, 17.75f, 19.5f, 17.75f)
                curveTo(20.4665f, 17.75f, 21.25f, 16.9665f, 21.25f, 16.0f)
                curveTo(21.25f, 15.4041f, 20.9521f, 14.8777f, 20.4972f, 14.5617f)
                curveTo(20.5282f, 14.3674f, 20.5442f, 14.1693f, 20.5442f, 13.9688f)
                verticalLineTo(9.0312f)
                curveTo(20.5442f, 8.9893f, 20.5435f, 8.9476f, 20.5422f, 8.906f)
                curveTo(20.9717f, 8.5871f, 21.25f, 8.076f, 21.25f, 7.5f)
                curveTo(21.25f, 6.5335f, 20.4665f, 5.75f, 19.5f, 5.75f)
                curveTo(19.263f, 5.75f, 19.0371f, 5.7971f, 18.831f, 5.8825f)
                curveTo(18.7527f, 5.8318f, 18.6721f, 5.7839f, 18.5895f, 5.7388f)
                lineTo(13.7952f, 3.1247f)
                curveTo(13.7629f, 3.107f, 13.7303f, 3.0899f, 13.6976f, 3.0733f)
                close()
                moveTo(10.6369f, 4.5975f)
                curveTo(10.9577f, 4.9954f, 11.4491f, 5.25f, 12.0f, 5.25f)
                curveTo(12.5509f, 5.25f, 13.0424f, 4.9954f, 13.3631f, 4.5975f)
                lineTo(17.8152f, 7.0251f)
                curveTo(17.7727f, 7.1761f, 17.75f, 7.3354f, 17.75f, 7.5f)
                curveTo(17.75f, 8.3088f, 18.2987f, 8.9895f, 19.0442f, 9.1901f)
                verticalLineTo(13.9688f)
                curveTo(19.0442f, 14.0867f, 19.035f, 14.2032f, 19.0171f, 14.3175f)
                curveTo(18.2855f, 14.5271f, 17.75f, 15.201f, 17.75f, 16.0f)
                curveTo(17.75f, 16.0035f, 17.75f, 16.0069f, 17.75f, 16.0104f)
                lineTo(16.4302f, 16.7301f)
                lineTo(14.179f, 12.6778f)
                curveTo(14.537f, 12.2136f, 14.75f, 11.6316f, 14.75f, 11.0f)
                curveTo(14.75f, 9.4812f, 13.5188f, 8.25f, 12.0f, 8.25f)
                curveTo(10.4812f, 8.25f, 9.25f, 9.4812f, 9.25f, 11.0f)
                curveTo(9.25f, 11.6316f, 9.463f, 12.2136f, 9.821f, 12.6778f)
                lineTo(7.5698f, 16.73f)
                lineTo(6.25f, 16.0104f)
                curveTo(6.25f, 16.0069f, 6.25f, 16.0035f, 6.25f, 16.0f)
                curveTo(6.25f, 15.201f, 5.7146f, 14.5271f, 4.9829f, 14.3175f)
                curveTo(4.965f, 14.2032f, 4.9558f, 14.0867f, 4.9558f, 13.9688f)
                verticalLineTo(9.1901f)
                curveTo(5.7013f, 8.9895f, 6.25f, 8.3088f, 6.25f, 7.5f)
                curveTo(6.25f, 7.3354f, 6.2273f, 7.1761f, 6.1848f, 7.0251f)
                lineTo(10.6369f, 4.5975f)
                close()
                moveTo(15.1133f, 17.4482f)
                lineTo(12.9625f, 13.5769f)
                curveTo(12.6629f, 13.6888f, 12.3386f, 13.75f, 12.0f, 13.75f)
                curveTo(11.6614f, 13.75f, 11.3371f, 13.6888f, 11.0375f, 13.5769f)
                lineTo(8.8868f, 17.4482f)
                lineTo(10.6369f, 18.4025f)
                curveTo(10.9577f, 18.0046f, 11.4491f, 17.75f, 12.0f, 17.75f)
                curveTo(12.5509f, 17.75f, 13.0424f, 18.0046f, 13.3631f, 18.4025f)
                lineTo(15.1133f, 17.4482f)
                close()
                moveTo(10.75f, 11.0f)
                curveTo(10.75f, 10.3096f, 11.3096f, 9.75f, 12.0f, 9.75f)
                curveTo(12.6904f, 9.75f, 13.25f, 10.3096f, 13.25f, 11.0f)
                curveTo(13.25f, 11.6904f, 12.6904f, 12.25f, 12.0f, 12.25f)
                curveTo(11.3096f, 12.25f, 10.75f, 11.6904f, 10.75f, 11.0f)
                close()
            }
        }
            .build()
        return _ferrisWheel!!
    }

private var _ferrisWheel: ImageVector? = null
