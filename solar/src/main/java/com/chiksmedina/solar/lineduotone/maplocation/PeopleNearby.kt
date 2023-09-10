package com.chiksmedina.solar.lineduotone.maplocation

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
import com.chiksmedina.solar.lineduotone.MapLocationGroup

val MapLocationGroup.PeopleNearby: ImageVector
    get() {
        if (_peopleNearby != null) {
            return _peopleNearby!!
        }
        _peopleNearby = Builder(
            name = "PeopleNearby", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.0f, 4.0f)
                curveTo(14.0f, 5.1046f, 13.1046f, 6.0f, 12.0f, 6.0f)
                curveTo(10.8954f, 6.0f, 10.0f, 5.1046f, 10.0f, 4.0f)
                curveTo(10.0f, 2.8954f, 10.8954f, 2.0f, 12.0f, 2.0f)
                curveTo(13.1046f, 2.0f, 14.0f, 2.8954f, 14.0f, 4.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.0478f, 10.849f)
                lineTo(6.285f, 10.1375f)
                lineTo(6.285f, 10.1375f)
                lineTo(6.0478f, 10.849f)
                close()
                moveTo(8.2231f, 11.5741f)
                lineTo(7.9859f, 12.2856f)
                lineTo(7.9859f, 12.2856f)
                lineTo(8.2231f, 11.5741f)
                close()
                moveTo(9.0168f, 13.256f)
                lineTo(8.3168f, 12.9868f)
                lineTo(8.3168f, 12.9868f)
                lineTo(9.0168f, 13.256f)
                close()
                moveTo(7.77f, 16.4977f)
                lineTo(8.47f, 16.7669f)
                lineTo(8.47f, 16.7669f)
                lineTo(7.77f, 16.4977f)
                close()
                moveTo(17.9522f, 10.849f)
                lineTo(17.715f, 10.1375f)
                lineTo(17.715f, 10.1375f)
                lineTo(17.9522f, 10.849f)
                close()
                moveTo(15.7769f, 11.5741f)
                lineTo(16.0141f, 12.2856f)
                lineTo(16.0141f, 12.2856f)
                lineTo(15.7769f, 11.5741f)
                close()
                moveTo(14.9832f, 13.256f)
                lineTo(15.6832f, 12.9868f)
                lineTo(15.6832f, 12.9868f)
                lineTo(14.9832f, 13.256f)
                close()
                moveTo(16.23f, 16.4977f)
                lineTo(15.53f, 16.7669f)
                lineTo(15.53f, 16.7669f)
                lineTo(16.23f, 16.4977f)
                close()
                moveTo(10.4242f, 17.7574f)
                lineTo(11.0754f, 18.1295f)
                lineTo(11.0754f, 18.1295f)
                lineTo(10.4242f, 17.7574f)
                close()
                moveTo(12.0f, 14.9997f)
                lineTo(12.6512f, 14.6276f)
                curveTo(12.5177f, 14.394f, 12.2691f, 14.2497f, 12.0f, 14.2497f)
                curveTo(11.7309f, 14.2497f, 11.4823f, 14.394f, 11.3488f, 14.6276f)
                lineTo(12.0f, 14.9997f)
                close()
                moveTo(17.1465f, 7.8969f)
                lineTo(16.9894f, 7.1635f)
                lineTo(16.9894f, 7.1635f)
                lineTo(17.1465f, 7.8969f)
                close()
                moveTo(15.249f, 8.3035f)
                lineTo(15.4061f, 9.0369f)
                lineTo(15.4061f, 9.0369f)
                lineTo(15.249f, 8.3035f)
                close()
                moveTo(8.751f, 8.3035f)
                lineTo(8.9082f, 7.5702f)
                lineTo(8.9082f, 7.5702f)
                lineTo(8.751f, 8.3035f)
                close()
                moveTo(6.8534f, 7.8969f)
                lineTo(6.6963f, 8.6303f)
                lineTo(6.6963f, 8.6303f)
                lineTo(6.8534f, 7.8969f)
                close()
                moveTo(13.5758f, 17.7574f)
                lineTo(12.9246f, 18.1295f)
                lineTo(12.9246f, 18.1295f)
                lineTo(13.5758f, 17.7574f)
                close()
                moveTo(15.0384f, 8.3483f)
                lineTo(14.8865f, 7.6138f)
                lineTo(14.8865f, 7.6138f)
                lineTo(15.0384f, 8.3483f)
                close()
                moveTo(8.9616f, 8.3483f)
                lineTo(8.8097f, 9.0827f)
                lineTo(8.8097f, 9.0827f)
                lineTo(8.9616f, 8.3483f)
                close()
                moveTo(15.2837f, 11.7666f)
                lineTo(15.6777f, 12.4048f)
                lineTo(15.6777f, 12.4048f)
                lineTo(15.2837f, 11.7666f)
                close()
                moveTo(14.8182f, 12.753f)
                lineTo(15.5613f, 12.6514f)
                lineTo(15.5613f, 12.6514f)
                lineTo(14.8182f, 12.753f)
                close()
                moveTo(8.7163f, 11.7666f)
                lineTo(8.3223f, 12.4048f)
                lineTo(8.3223f, 12.4048f)
                lineTo(8.7163f, 11.7666f)
                close()
                moveTo(9.1818f, 12.753f)
                lineTo(9.9249f, 12.8546f)
                lineTo(9.9249f, 12.8546f)
                lineTo(9.1818f, 12.753f)
                close()
                moveTo(5.8106f, 11.5605f)
                lineTo(7.9859f, 12.2856f)
                lineTo(8.4603f, 10.8626f)
                lineTo(6.285f, 10.1375f)
                lineTo(5.8106f, 11.5605f)
                close()
                moveTo(8.3168f, 12.9868f)
                lineTo(7.07f, 16.2284f)
                lineTo(8.47f, 16.7669f)
                lineTo(9.7168f, 13.5252f)
                lineTo(8.3168f, 12.9868f)
                close()
                moveTo(17.715f, 10.1375f)
                lineTo(15.5397f, 10.8626f)
                lineTo(16.0141f, 12.2856f)
                lineTo(18.1894f, 11.5605f)
                lineTo(17.715f, 10.1375f)
                close()
                moveTo(14.2832f, 13.5252f)
                lineTo(15.53f, 16.7669f)
                lineTo(16.93f, 16.2284f)
                lineTo(15.6832f, 12.9868f)
                lineTo(14.2832f, 13.5252f)
                close()
                moveTo(11.0754f, 18.1295f)
                lineTo(12.6512f, 15.3718f)
                lineTo(11.3488f, 14.6276f)
                lineTo(9.773f, 17.3853f)
                lineTo(11.0754f, 18.1295f)
                close()
                moveTo(16.9894f, 7.1635f)
                lineTo(15.0918f, 7.5702f)
                lineTo(15.4061f, 9.0369f)
                lineTo(17.3037f, 8.6303f)
                lineTo(16.9894f, 7.1635f)
                close()
                moveTo(8.9082f, 7.5702f)
                lineTo(7.0106f, 7.1635f)
                lineTo(6.6963f, 8.6303f)
                lineTo(8.5939f, 9.0369f)
                lineTo(8.9082f, 7.5702f)
                close()
                moveTo(11.3488f, 15.3718f)
                lineTo(12.9246f, 18.1295f)
                lineTo(14.227f, 17.3853f)
                lineTo(12.6512f, 14.6276f)
                lineTo(11.3488f, 15.3718f)
                close()
                moveTo(15.0918f, 7.5702f)
                curveTo(14.9853f, 7.593f, 14.9356f, 7.6037f, 14.8865f, 7.6138f)
                lineTo(15.1903f, 9.0827f)
                curveTo(15.2458f, 9.0712f, 15.3016f, 9.0593f, 15.4061f, 9.0369f)
                lineTo(15.0918f, 7.5702f)
                close()
                moveTo(8.5939f, 9.0369f)
                curveTo(8.6984f, 9.0593f, 8.7542f, 9.0712f, 8.8097f, 9.0827f)
                lineTo(9.1135f, 7.6138f)
                curveTo(9.0644f, 7.6037f, 9.0147f, 7.593f, 8.9082f, 7.5702f)
                lineTo(8.5939f, 9.0369f)
                close()
                moveTo(14.8865f, 7.6138f)
                curveTo(12.9823f, 8.0077f, 11.0177f, 8.0077f, 9.1135f, 7.6138f)
                lineTo(8.8097f, 9.0827f)
                curveTo(10.9143f, 9.5181f, 13.0857f, 9.5181f, 15.1903f, 9.0827f)
                lineTo(14.8865f, 7.6138f)
                close()
                moveTo(9.1451f, 19.2497f)
                curveTo(9.9429f, 19.2497f, 10.6795f, 18.8222f, 11.0754f, 18.1295f)
                lineTo(9.773f, 17.3853f)
                curveTo(9.6442f, 17.6107f, 9.4046f, 17.7497f, 9.1451f, 17.7497f)
                verticalLineTo(19.2497f)
                close()
                moveTo(15.53f, 16.7669f)
                curveTo(15.7122f, 17.2406f, 15.3625f, 17.7497f, 14.8549f, 17.7497f)
                verticalLineTo(19.2497f)
                curveTo(16.4152f, 19.2497f, 17.4901f, 17.6846f, 16.93f, 16.2284f)
                lineTo(15.53f, 16.7669f)
                close()
                moveTo(15.5397f, 10.8626f)
                curveTo(15.3178f, 10.9366f, 15.0816f, 11.01f, 14.8898f, 11.1283f)
                lineTo(15.6777f, 12.4048f)
                curveTo(15.6688f, 12.4102f, 15.6763f, 12.4037f, 15.7342f, 12.3818f)
                curveTo(15.795f, 12.3588f, 15.877f, 12.3313f, 16.0141f, 12.2856f)
                lineTo(15.5397f, 10.8626f)
                close()
                moveTo(15.6832f, 12.9868f)
                curveTo(15.6313f, 12.8519f, 15.6004f, 12.7711f, 15.5795f, 12.7095f)
                curveTo(15.5596f, 12.651f, 15.5599f, 12.6411f, 15.5613f, 12.6514f)
                lineTo(14.0751f, 12.8546f)
                curveTo(14.1057f, 13.0779f, 14.1992f, 13.3069f, 14.2832f, 13.5252f)
                lineTo(15.6832f, 12.9868f)
                close()
                moveTo(14.8898f, 11.1283f)
                curveTo(14.3007f, 11.492f, 13.9814f, 12.1687f, 14.0751f, 12.8546f)
                lineTo(15.5613f, 12.6514f)
                curveTo(15.5479f, 12.5534f, 15.5935f, 12.4567f, 15.6777f, 12.4048f)
                lineTo(14.8898f, 11.1283f)
                close()
                moveTo(18.25f, 9.3953f)
                curveTo(18.25f, 9.732f, 18.0345f, 10.031f, 17.715f, 10.1375f)
                lineTo(18.1894f, 11.5605f)
                curveTo(19.1214f, 11.2499f, 19.75f, 10.3777f, 19.75f, 9.3953f)
                horizontalLineTo(18.25f)
                close()
                moveTo(7.07f, 16.2284f)
                curveTo(6.5099f, 17.6846f, 7.5848f, 19.2497f, 9.1451f, 19.2497f)
                verticalLineTo(17.7497f)
                curveTo(8.6375f, 17.7497f, 8.2878f, 17.2406f, 8.47f, 16.7669f)
                lineTo(7.07f, 16.2284f)
                close()
                moveTo(7.9859f, 12.2856f)
                curveTo(8.123f, 12.3313f, 8.205f, 12.3588f, 8.2658f, 12.3818f)
                curveTo(8.3237f, 12.4037f, 8.3312f, 12.4102f, 8.3223f, 12.4048f)
                lineTo(9.1102f, 11.1283f)
                curveTo(8.9184f, 11.01f, 8.6822f, 10.9366f, 8.4603f, 10.8626f)
                lineTo(7.9859f, 12.2856f)
                close()
                moveTo(9.7168f, 13.5252f)
                curveTo(9.8008f, 13.3069f, 9.8943f, 13.0779f, 9.9249f, 12.8546f)
                lineTo(8.4387f, 12.6514f)
                curveTo(8.4401f, 12.6411f, 8.4404f, 12.6509f, 8.4205f, 12.7095f)
                curveTo(8.3996f, 12.7711f, 8.3687f, 12.8519f, 8.3168f, 12.9868f)
                lineTo(9.7168f, 13.5252f)
                close()
                moveTo(8.3223f, 12.4048f)
                curveTo(8.4065f, 12.4567f, 8.4521f, 12.5534f, 8.4387f, 12.6514f)
                lineTo(9.9249f, 12.8546f)
                curveTo(10.0186f, 12.1687f, 9.6993f, 11.492f, 9.1102f, 11.1283f)
                lineTo(8.3223f, 12.4048f)
                close()
                moveTo(4.25f, 9.3953f)
                curveTo(4.25f, 10.3777f, 4.8786f, 11.2499f, 5.8106f, 11.5605f)
                lineTo(6.285f, 10.1375f)
                curveTo(5.9655f, 10.031f, 5.75f, 9.732f, 5.75f, 9.3953f)
                horizontalLineTo(4.25f)
                close()
                moveTo(5.75f, 9.3953f)
                curveTo(5.75f, 8.8972f, 6.2093f, 8.5259f, 6.6963f, 8.6303f)
                lineTo(7.0106f, 7.1635f)
                curveTo(5.5898f, 6.8591f, 4.25f, 7.9422f, 4.25f, 9.3953f)
                horizontalLineTo(5.75f)
                close()
                moveTo(12.9246f, 18.1295f)
                curveTo(13.3205f, 18.8222f, 14.0571f, 19.2497f, 14.8549f, 19.2497f)
                verticalLineTo(17.7497f)
                curveTo(14.5954f, 17.7497f, 14.3558f, 17.6107f, 14.227f, 17.3853f)
                lineTo(12.9246f, 18.1295f)
                close()
                moveTo(19.75f, 9.3953f)
                curveTo(19.75f, 7.9422f, 18.4102f, 6.8591f, 16.9894f, 7.1635f)
                lineTo(17.3037f, 8.6303f)
                curveTo(17.7907f, 8.5259f, 18.25f, 8.8972f, 18.25f, 9.3953f)
                horizontalLineTo(19.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.4537f, 14.5f)
                curveTo(21.0372f, 15.2961f, 22.0f, 16.3475f, 22.0f, 17.5f)
                curveTo(22.0f, 19.9853f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 19.9853f, 2.0f, 17.5f)
                curveTo(2.0f, 16.3475f, 2.9629f, 15.2961f, 4.5463f, 14.5f)
            }
        }
            .build()
        return _peopleNearby!!
    }

private var _peopleNearby: ImageVector? = null
