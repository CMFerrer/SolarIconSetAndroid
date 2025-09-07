package com.chiksmedina.solar.outline.time

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.TimeGroup

val TimeGroup.Hourglass: ImageVector
    get() {
        if (_hourglass != null) {
            return _hourglass!!
        }
        _hourglass = Builder(
            name = "Hourglass", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.9376f, 1.25f)
                horizontalLineTo(12.0624f)
                curveTo(14.0761f, 1.25f, 15.6654f, 1.25f, 16.823f, 1.4026f)
                curveTo(17.9607f, 1.5526f, 18.983f, 1.8832f, 19.4685f, 2.8259f)
                curveTo(19.5385f, 2.9617f, 19.5975f, 3.1028f, 19.6451f, 3.248f)
                curveTo(19.9763f, 4.2589f, 19.4861f, 5.2139f, 18.7879f, 6.1177f)
                curveTo(18.0778f, 7.0368f, 16.9536f, 8.1501f, 15.5303f, 9.5596f)
                lineTo(13.0659f, 12.0f)
                lineTo(15.5303f, 14.4404f)
                curveTo(16.9536f, 15.8499f, 18.0778f, 16.9632f, 18.7879f, 17.8823f)
                curveTo(19.4861f, 18.7861f, 19.9763f, 19.7411f, 19.6451f, 20.752f)
                curveTo(19.5975f, 20.8972f, 19.5385f, 21.0383f, 19.4685f, 21.1741f)
                curveTo(18.983f, 22.1168f, 17.9607f, 22.4474f, 16.823f, 22.5974f)
                curveTo(15.6654f, 22.75f, 14.0761f, 22.75f, 12.0624f, 22.75f)
                horizontalLineTo(11.9376f)
                curveTo(9.9239f, 22.75f, 8.3346f, 22.75f, 7.177f, 22.5974f)
                curveTo(6.0393f, 22.4474f, 5.017f, 22.1168f, 4.5315f, 21.1741f)
                curveTo(4.4615f, 21.0383f, 4.4025f, 20.8972f, 4.3549f, 20.752f)
                curveTo(4.0237f, 19.7411f, 4.5139f, 18.7861f, 5.2121f, 17.8823f)
                curveTo(5.9222f, 16.9632f, 7.0464f, 15.8499f, 8.4697f, 14.4404f)
                lineTo(10.9341f, 12.0f)
                lineTo(8.4697f, 9.5596f)
                curveTo(7.0464f, 8.1501f, 5.9222f, 7.0368f, 5.2121f, 6.1177f)
                curveTo(4.5139f, 5.2139f, 4.0237f, 4.2589f, 4.3549f, 3.248f)
                curveTo(4.4025f, 3.1028f, 4.4615f, 2.9617f, 4.5315f, 2.8259f)
                curveTo(5.017f, 1.8832f, 6.0393f, 1.5526f, 7.177f, 1.4026f)
                curveTo(8.3346f, 1.25f, 9.9239f, 1.25f, 11.9376f, 1.25f)
                close()
                moveTo(12.0f, 10.9445f)
                lineTo(14.43f, 8.5381f)
                curveTo(15.9079f, 7.0746f, 16.9594f, 6.0311f, 17.6008f, 5.2007f)
                curveTo(18.2616f, 4.3453f, 18.2975f, 3.9525f, 18.2196f, 3.715f)
                curveTo(18.1969f, 3.6455f, 18.1686f, 3.5779f, 18.135f, 3.5127f)
                curveTo(18.0183f, 3.2861f, 17.7062f, 3.032f, 16.6269f, 2.8897f)
                curveTo(15.5793f, 2.7516f, 14.0897f, 2.75f, 12.0f, 2.75f)
                curveTo(9.9103f, 2.75f, 8.4207f, 2.7516f, 7.3731f, 2.8897f)
                curveTo(6.2938f, 3.032f, 5.9817f, 3.2861f, 5.865f, 3.5127f)
                curveTo(5.8314f, 3.5779f, 5.8031f, 3.6455f, 5.7804f, 3.715f)
                curveTo(5.7025f, 3.9525f, 5.7384f, 4.3453f, 6.3992f, 5.2007f)
                curveTo(7.0406f, 6.0311f, 8.0921f, 7.0746f, 9.57f, 8.5381f)
                lineTo(12.0f, 10.9445f)
                close()
                moveTo(12.0f, 13.0555f)
                lineTo(9.57f, 15.4618f)
                curveTo(8.0921f, 16.9254f, 7.0406f, 17.969f, 6.3992f, 18.7993f)
                curveTo(5.7384f, 19.6547f, 5.7025f, 20.0475f, 5.7804f, 20.285f)
                curveTo(5.8031f, 20.3545f, 5.8314f, 20.4221f, 5.865f, 20.4873f)
                curveTo(5.9817f, 20.7139f, 6.2938f, 20.968f, 7.3731f, 21.1103f)
                curveTo(8.4207f, 21.2484f, 9.9103f, 21.25f, 12.0f, 21.25f)
                curveTo(14.0897f, 21.25f, 15.5793f, 21.2484f, 16.6269f, 21.1103f)
                curveTo(17.7062f, 20.968f, 18.0183f, 20.7139f, 18.135f, 20.4873f)
                curveTo(18.1686f, 20.4221f, 18.1969f, 20.3545f, 18.2196f, 20.285f)
                curveTo(18.2975f, 20.0475f, 18.2616f, 19.6547f, 17.6008f, 18.7993f)
                curveTo(16.9594f, 17.969f, 15.9079f, 16.9254f, 14.43f, 15.4618f)
                lineTo(12.0f, 13.0555f)
                close()
            }
        }
            .build()
        return _hourglass!!
    }

private var _hourglass: ImageVector? = null
