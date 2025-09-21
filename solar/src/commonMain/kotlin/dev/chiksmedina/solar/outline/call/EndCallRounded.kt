package dev.chiksmedina.solar.outline.call

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.CallGroup

val CallGroup.EndCallRounded: ImageVector
    get() {
        if (_endCallRounded != null) {
            return _endCallRounded!!
        }
        _endCallRounded = Builder(
            name = "EndCallRounded", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 7.75f)
                curveTo(7.4353f, 7.75f, 4.8727f, 9.6756f, 3.6329f, 11.0131f)
                curveTo(3.0108f, 11.6842f, 2.75f, 12.6999f, 2.75f, 13.8504f)
                curveTo(2.75f, 15.5042f, 4.1403f, 16.5337f, 5.4026f, 16.1757f)
                lineTo(6.7422f, 15.7957f)
                curveTo(7.592f, 15.5547f, 8.25f, 14.6868f, 8.25f, 13.6185f)
                curveTo(8.25f, 13.5201f, 8.2707f, 12.8926f, 8.8194f, 12.2875f)
                curveTo(9.3806f, 11.6683f, 10.3644f, 11.2139f, 12.0f, 11.2139f)
                curveTo(13.6356f, 11.2139f, 14.6193f, 11.6683f, 15.1806f, 12.2874f)
                curveTo(15.7293f, 12.8926f, 15.75f, 13.52f, 15.75f, 13.6185f)
                verticalLineTo(13.6185f)
                curveTo(15.75f, 14.6868f, 16.408f, 15.5547f, 17.2577f, 15.7958f)
                lineTo(18.5974f, 16.1757f)
                curveTo(19.8597f, 16.5337f, 21.25f, 15.5042f, 21.25f, 13.8504f)
                curveTo(21.25f, 12.6999f, 20.9892f, 11.6842f, 20.3671f, 11.0131f)
                curveTo(19.1273f, 9.6756f, 16.5647f, 7.75f, 12.0f, 7.75f)
                close()
                moveTo(2.5329f, 9.9933f)
                curveTo(4.0077f, 8.4022f, 6.9511f, 6.25f, 12.0f, 6.25f)
                curveTo(17.0489f, 6.25f, 19.9923f, 8.4022f, 21.4672f, 9.9933f)
                curveTo(22.4576f, 11.0619f, 22.75f, 12.5255f, 22.75f, 13.8504f)
                curveTo(22.75f, 16.3163f, 20.5772f, 18.2964f, 18.1882f, 17.6188f)
                lineTo(16.8484f, 17.2388f)
                curveTo(15.2871f, 16.796f, 14.2591f, 15.2918f, 14.2501f, 13.6405f)
                curveTo(14.2463f, 13.6147f, 14.22f, 13.461f, 14.0693f, 13.2949f)
                curveTo(13.8806f, 13.0867f, 13.3644f, 12.7139f, 12.0f, 12.7139f)
                curveTo(10.6356f, 12.7139f, 10.1194f, 13.0867f, 9.9307f, 13.2949f)
                curveTo(9.7801f, 13.4611f, 9.7537f, 13.6147f, 9.7499f, 13.6405f)
                curveTo(9.7409f, 15.2918f, 8.7129f, 16.796f, 7.1515f, 17.2388f)
                lineTo(5.8119f, 17.6188f)
                curveTo(3.4228f, 18.2964f, 1.25f, 16.3163f, 1.25f, 13.8504f)
                curveTo(1.25f, 12.5255f, 1.5424f, 11.0619f, 2.5329f, 9.9933f)
                close()
            }
        }
            .build()
        return _endCallRounded!!
    }

private var _endCallRounded: ImageVector? = null
