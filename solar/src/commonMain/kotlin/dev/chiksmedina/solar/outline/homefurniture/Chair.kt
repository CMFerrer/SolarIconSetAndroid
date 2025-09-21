package dev.chiksmedina.solar.outline.homefurniture

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.HomeFurnitureGroup

val HomeFurnitureGroup.Chair: ImageVector
    get() {
        if (_chair != null) {
            return _chair!!
        }
        _chair = Builder(
            name = "Chair", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.9642f, 2.25f)
                horizontalLineTo(12.0358f)
                curveTo(12.94f, 2.25f, 13.6693f, 2.25f, 14.2576f, 2.3033f)
                curveTo(14.8639f, 2.3583f, 15.3937f, 2.4746f, 15.875f, 2.7524f)
                curveTo(16.4451f, 3.0815f, 16.9184f, 3.5549f, 17.2476f, 4.125f)
                curveTo(17.5254f, 4.6062f, 17.6417f, 5.1361f, 17.6967f, 5.7424f)
                curveTo(17.75f, 6.3307f, 17.75f, 7.06f, 17.75f, 7.9642f)
                verticalLineTo(11.371f)
                curveTo(18.244f, 11.4754f, 18.691f, 11.6795f, 19.0519f, 12.0919f)
                curveTo(19.4974f, 12.6011f, 19.6427f, 13.2365f, 19.7029f, 13.9366f)
                curveTo(19.7043f, 13.9525f, 19.7056f, 13.9684f, 19.707f, 13.9843f)
                curveTo(19.7422f, 14.3935f, 19.7756f, 14.7811f, 19.754f, 15.105f)
                curveTo(19.7291f, 15.4762f, 19.6284f, 15.855f, 19.3272f, 16.1833f)
                curveTo(19.0161f, 16.5223f, 18.6254f, 16.6485f, 18.2513f, 16.702f)
                curveTo(18.0989f, 16.7237f, 17.9305f, 16.7357f, 17.75f, 16.7422f)
                verticalLineTo(21.0f)
                curveTo(17.75f, 21.4142f, 17.4142f, 21.75f, 17.0f, 21.75f)
                curveTo(16.5858f, 21.75f, 16.25f, 21.4142f, 16.25f, 21.0f)
                verticalLineTo(16.75f)
                horizontalLineTo(7.75f)
                verticalLineTo(21.0f)
                curveTo(7.75f, 21.4142f, 7.4142f, 21.75f, 7.0f, 21.75f)
                curveTo(6.5858f, 21.75f, 6.25f, 21.4142f, 6.25f, 21.0f)
                verticalLineTo(16.7422f)
                curveTo(6.0695f, 16.7357f, 5.9011f, 16.7237f, 5.7487f, 16.702f)
                curveTo(5.3745f, 16.6485f, 4.9839f, 16.5223f, 4.6728f, 16.1833f)
                curveTo(4.3716f, 15.855f, 4.2709f, 15.4762f, 4.246f, 15.105f)
                curveTo(4.2243f, 14.7811f, 4.2577f, 14.3934f, 4.293f, 13.9842f)
                curveTo(4.2943f, 13.9684f, 4.2957f, 13.9525f, 4.2971f, 13.9366f)
                curveTo(4.3573f, 13.2365f, 4.5026f, 12.6011f, 4.9481f, 12.0919f)
                curveTo(5.309f, 11.6795f, 5.756f, 11.4754f, 6.25f, 11.371f)
                lineTo(6.25f, 7.9642f)
                curveTo(6.25f, 7.06f, 6.25f, 6.3307f, 6.3033f, 5.7424f)
                curveTo(6.3582f, 5.1361f, 6.4745f, 4.6062f, 6.7524f, 4.125f)
                curveTo(7.0815f, 3.5549f, 7.5549f, 3.0815f, 8.125f, 2.7524f)
                curveTo(8.6062f, 2.4746f, 9.136f, 2.3583f, 9.7424f, 2.3033f)
                curveTo(10.3307f, 2.25f, 11.06f, 2.25f, 11.9642f, 2.25f)
                close()
                moveTo(8.4436f, 11.25f)
                curveTo(8.407f, 11.25f, 8.3706f, 11.25f, 8.3344f, 11.25f)
                horizontalLineTo(7.75f)
                verticalLineTo(8.0f)
                curveTo(7.75f, 7.0516f, 7.7507f, 6.3904f, 7.7972f, 5.8778f)
                curveTo(7.8427f, 5.3755f, 7.9274f, 5.0899f, 8.0514f, 4.875f)
                curveTo(8.2489f, 4.533f, 8.5329f, 4.2489f, 8.875f, 4.0514f)
                curveTo(9.0899f, 3.9274f, 9.3755f, 3.8427f, 9.8778f, 3.7972f)
                curveTo(10.3904f, 3.7507f, 11.0516f, 3.75f, 12.0f, 3.75f)
                curveTo(12.9484f, 3.75f, 13.6096f, 3.7507f, 14.1222f, 3.7972f)
                curveTo(14.6245f, 3.8427f, 14.9101f, 3.9274f, 15.125f, 4.0514f)
                curveTo(15.467f, 4.2489f, 15.7511f, 4.533f, 15.9485f, 4.875f)
                curveTo(16.0726f, 5.0899f, 16.1573f, 5.3755f, 16.2028f, 5.8778f)
                curveTo(16.2493f, 6.3904f, 16.25f, 7.0516f, 16.25f, 8.0f)
                verticalLineTo(11.25f)
                horizontalLineTo(15.6655f)
                curveTo(15.6294f, 11.25f, 15.593f, 11.25f, 15.5564f, 11.25f)
                horizontalLineTo(8.4436f)
                close()
                moveTo(8.5f, 12.75f)
                curveTo(7.6509f, 12.75f, 7.1001f, 12.7521f, 6.6937f, 12.8145f)
                curveTo(6.3201f, 12.8719f, 6.1768f, 12.9656f, 6.077f, 13.0797f)
                curveTo(5.9508f, 13.2239f, 5.8432f, 13.4641f, 5.7916f, 14.065f)
                curveTo(5.7508f, 14.5393f, 5.7296f, 14.8098f, 5.7427f, 15.0048f)
                curveTo(5.7485f, 15.0915f, 5.7599f, 15.1324f, 5.7658f, 15.1487f)
                curveTo(5.7696f, 15.1592f, 5.7717f, 15.1623f, 5.7779f, 15.169f)
                lineTo(5.7791f, 15.1703f)
                curveTo(5.7791f, 15.1703f, 5.7791f, 15.1703f, 5.7791f, 15.1703f)
                lineTo(5.7822f, 15.1723f)
                curveTo(5.784f, 15.1733f, 5.7871f, 15.1749f, 5.7919f, 15.1771f)
                curveTo(5.8128f, 15.1863f, 5.8613f, 15.2028f, 5.9608f, 15.2171f)
                curveTo(6.1789f, 15.2482f, 6.4849f, 15.25f, 7.0f, 15.25f)
                horizontalLineTo(17.0f)
                curveTo(17.5151f, 15.25f, 17.8211f, 15.2482f, 18.0391f, 15.2171f)
                curveTo(18.1387f, 15.2028f, 18.1871f, 15.1863f, 18.208f, 15.1771f)
                curveTo(18.2129f, 15.1749f, 18.216f, 15.1733f, 18.2178f, 15.1723f)
                lineTo(18.2204f, 15.1707f)
                curveTo(18.2205f, 15.1706f, 18.2205f, 15.1706f, 18.2204f, 15.1707f)
                lineTo(18.222f, 15.169f)
                curveTo(18.2282f, 15.1623f, 18.2303f, 15.1592f, 18.2341f, 15.1487f)
                curveTo(18.2401f, 15.1324f, 18.2515f, 15.0915f, 18.2573f, 15.0048f)
                curveTo(18.2704f, 14.8098f, 18.2492f, 14.5393f, 18.2084f, 14.065f)
                curveTo(18.1567f, 13.4641f, 18.0492f, 13.2239f, 17.923f, 13.0797f)
                curveTo(17.8232f, 12.9656f, 17.6798f, 12.8719f, 17.3063f, 12.8145f)
                curveTo(16.8998f, 12.7521f, 16.3491f, 12.75f, 15.5f, 12.75f)
                horizontalLineTo(8.5f)
                close()
            }
        }
            .build()
        return _chair!!
    }

private var _chair: ImageVector? = null
