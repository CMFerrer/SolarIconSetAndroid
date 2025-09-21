package dev.chiksmedina.solar.boldduotone.security

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.SecurityGroup

val SecurityGroup.QrCode: ImageVector
    get() {
        if (_qrCode != null) {
            return _qrCode!!
        }
        _qrCode = Builder(
            name = "QrCode", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.5531f, 13.4469f)
                curveTo(10.1294f, 13.0232f, 9.6021f, 12.8505f, 9.0181f, 12.772f)
                curveTo(8.4648f, 12.6976f, 7.7679f, 12.6976f, 6.9321f, 12.6977f)
                lineTo(5.8272f, 12.6977f)
                curveTo(5.2465f, 12.6977f, 4.7618f, 12.6976f, 4.3682f, 12.7351f)
                curveTo(3.9567f, 12.7742f, 3.5733f, 12.8591f, 3.2215f, 13.0746f)
                curveTo(2.8773f, 13.2856f, 2.5879f, 13.575f, 2.377f, 13.9192f)
                curveTo(2.1614f, 14.2709f, 2.0765f, 14.6544f, 2.0374f, 15.0659f)
                curveTo(2.0f, 15.4595f, 2.0f, 15.9442f, 2.0f, 16.5249f)
                verticalLineTo(16.5932f)
                curveTo(2.0f, 17.477f, 2.0f, 18.1897f, 2.0545f, 18.7635f)
                curveTo(2.1108f, 19.3552f, 2.23f, 19.8707f, 2.5141f, 20.3343f)
                curveTo(2.8017f, 20.8037f, 3.1963f, 21.1983f, 3.6657f, 21.486f)
                curveTo(4.1293f, 21.77f, 4.6448f, 21.8892f, 5.2365f, 21.9455f)
                curveTo(5.8103f, 22.0f, 6.523f, 22.0f, 7.4068f, 22.0f)
                horizontalLineTo(7.4751f)
                curveTo(8.0558f, 22.0f, 8.5405f, 22.0f, 8.9341f, 21.9626f)
                curveTo(9.3456f, 21.9235f, 9.7291f, 21.8386f, 10.0808f, 21.623f)
                curveTo(10.425f, 21.4121f, 10.7144f, 21.1227f, 10.9254f, 20.7785f)
                curveTo(11.1409f, 20.4267f, 11.2258f, 20.0433f, 11.2649f, 19.6318f)
                curveTo(11.3024f, 19.2382f, 11.3023f, 18.7535f, 11.3023f, 18.1728f)
                lineTo(11.3023f, 17.0679f)
                curveTo(11.3024f, 16.2321f, 11.3024f, 15.5352f, 11.228f, 14.9819f)
                curveTo(11.1495f, 14.3979f, 10.9768f, 13.8706f, 10.5531f, 13.4469f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.9341f, 2.0374f)
                curveTo(9.3456f, 2.0765f, 9.7291f, 2.1614f, 10.0808f, 2.377f)
                curveTo(10.425f, 2.5879f, 10.7144f, 2.8773f, 10.9254f, 3.2215f)
                curveTo(11.1409f, 3.5733f, 11.2258f, 3.9567f, 11.2649f, 4.3682f)
                curveTo(11.3024f, 4.7618f, 11.3023f, 5.2466f, 11.3023f, 5.8273f)
                lineTo(11.3023f, 6.9321f)
                curveTo(11.3024f, 7.7679f, 11.3024f, 8.4648f, 11.228f, 9.0181f)
                curveTo(11.1495f, 9.6021f, 10.9768f, 10.1294f, 10.5531f, 10.5531f)
                curveTo(10.1294f, 10.9768f, 9.6021f, 11.1495f, 9.0181f, 11.228f)
                curveTo(8.4648f, 11.3024f, 7.7679f, 11.3024f, 6.9321f, 11.3023f)
                lineTo(5.8271f, 11.3023f)
                curveTo(5.2464f, 11.3023f, 4.7618f, 11.3024f, 4.3682f, 11.2649f)
                curveTo(3.9567f, 11.2258f, 3.5733f, 11.1409f, 3.2215f, 10.9254f)
                curveTo(2.8773f, 10.7144f, 2.5879f, 10.425f, 2.377f, 10.0808f)
                curveTo(2.1614f, 9.7291f, 2.0765f, 9.3456f, 2.0374f, 8.9341f)
                curveTo(2.0f, 8.5405f, 2.0f, 8.0558f, 2.0f, 7.4751f)
                verticalLineTo(7.4068f)
                curveTo(2.0f, 6.523f, 2.0f, 5.8103f, 2.0545f, 5.2365f)
                curveTo(2.1108f, 4.6448f, 2.23f, 4.1293f, 2.5141f, 3.6657f)
                curveTo(2.8017f, 3.1963f, 3.1963f, 2.8017f, 3.6657f, 2.5141f)
                curveTo(4.1293f, 2.23f, 4.6448f, 2.1108f, 5.2365f, 2.0545f)
                curveTo(5.8103f, 2.0f, 6.5231f, 2.0f, 7.4068f, 2.0f)
                horizontalLineTo(7.4751f)
                curveTo(8.0558f, 2.0f, 8.5405f, 2.0f, 8.9341f, 2.0374f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.5932f, 2.0f)
                horizontalLineTo(16.5249f)
                curveTo(15.9442f, 2.0f, 15.4595f, 2.0f, 15.0659f, 2.0374f)
                curveTo(14.6544f, 2.0765f, 14.2709f, 2.1614f, 13.9192f, 2.377f)
                curveTo(13.575f, 2.5879f, 13.2856f, 2.8773f, 13.0746f, 3.2215f)
                curveTo(12.8591f, 3.5733f, 12.7742f, 3.9567f, 12.7351f, 4.3682f)
                curveTo(12.6976f, 4.7618f, 12.6977f, 5.2465f, 12.6977f, 5.8273f)
                lineTo(12.6977f, 6.9321f)
                curveTo(12.6976f, 7.7679f, 12.6976f, 8.4648f, 12.772f, 9.0181f)
                curveTo(12.8505f, 9.6021f, 13.0232f, 10.1294f, 13.4469f, 10.5531f)
                curveTo(13.8706f, 10.9768f, 14.3979f, 11.1495f, 14.9819f, 11.228f)
                curveTo(15.5352f, 11.3024f, 16.2321f, 11.3024f, 17.0679f, 11.3023f)
                lineTo(18.1728f, 11.3023f)
                curveTo(18.7535f, 11.3023f, 19.2382f, 11.3024f, 19.6318f, 11.2649f)
                curveTo(20.0433f, 11.2258f, 20.4267f, 11.1409f, 20.7785f, 10.9254f)
                curveTo(21.1227f, 10.7144f, 21.4121f, 10.425f, 21.623f, 10.0808f)
                curveTo(21.8386f, 9.7291f, 21.9235f, 9.3456f, 21.9626f, 8.9341f)
                curveTo(22.0f, 8.5405f, 22.0f, 8.0559f, 22.0f, 7.4752f)
                verticalLineTo(7.4068f)
                curveTo(22.0f, 6.523f, 22.0f, 5.8103f, 21.9455f, 5.2365f)
                curveTo(21.8892f, 4.6448f, 21.77f, 4.1293f, 21.486f, 3.6657f)
                curveTo(21.1983f, 3.1963f, 20.8037f, 2.8017f, 20.3343f, 2.5141f)
                curveTo(19.8707f, 2.23f, 19.3552f, 2.1108f, 18.7635f, 2.0545f)
                curveTo(18.1897f, 2.0f, 17.477f, 2.0f, 16.5932f, 2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.0926f, 21.3024f)
                curveTo(14.0926f, 21.6877f, 13.7803f, 22.0001f, 13.3949f, 22.0001f)
                curveTo(13.0096f, 22.0001f, 12.6973f, 21.6877f, 12.6973f, 21.3024f)
                verticalLineTo(18.5117f)
                horizontalLineTo(14.0926f)
                verticalLineTo(21.3024f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(21.3022f, 12.6978f)
                curveTo(20.9169f, 12.6978f, 20.6045f, 13.0101f, 20.6045f, 13.3954f)
                verticalLineTo(16.6512f)
                horizontalLineTo(21.9998f)
                verticalLineTo(13.3954f)
                curveTo(21.9998f, 13.0101f, 21.6875f, 12.6978f, 21.3022f, 12.6978f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.0761f, 16.6173f)
                curveTo(16.0f, 16.8011f, 16.0f, 17.0341f, 16.0f, 17.5f)
                curveTo(16.0f, 17.9659f, 16.0f, 18.1989f, 16.0761f, 18.3827f)
                curveTo(16.1776f, 18.6277f, 16.3723f, 18.8224f, 16.6173f, 18.9239f)
                curveTo(16.8011f, 19.0f, 17.0341f, 19.0f, 17.5f, 19.0f)
                curveTo(17.9659f, 19.0f, 18.1989f, 19.0f, 18.3827f, 18.9239f)
                curveTo(18.6277f, 18.8224f, 18.8224f, 18.6277f, 18.9239f, 18.3827f)
                curveTo(19.0f, 18.1989f, 19.0f, 17.9659f, 19.0f, 17.5f)
                curveTo(19.0f, 17.0341f, 19.0f, 16.8011f, 18.9239f, 16.6173f)
                curveTo(18.8224f, 16.3723f, 18.6277f, 16.1776f, 18.3827f, 16.0761f)
                curveTo(18.1989f, 16.0f, 17.9659f, 16.0f, 17.5f, 16.0f)
                curveTo(17.0341f, 16.0f, 16.8011f, 16.0f, 16.6173f, 16.0761f)
                curveTo(16.3723f, 16.1776f, 16.1776f, 16.3723f, 16.0761f, 16.6173f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.7f, strokeAlpha
                = 0.7f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(21.9995f, 18.5352f)
                verticalLineTo(18.5117f)
                horizontalLineTo(20.6041f)
                curveTo(20.6041f, 18.9547f, 20.6037f, 19.252f, 20.588f, 19.4822f)
                curveTo(20.5728f, 19.7061f, 20.5453f, 19.8152f, 20.5156f, 19.8869f)
                curveTo(20.3976f, 20.1718f, 20.1712f, 20.3982f, 19.8863f, 20.5162f)
                curveTo(19.8145f, 20.5459f, 19.7055f, 20.5734f, 19.4816f, 20.5886f)
                curveTo(19.2514f, 20.6044f, 18.9541f, 20.6047f, 18.5111f, 20.6047f)
                horizontalLineTo(16.6506f)
                verticalLineTo(22.0001f)
                horizontalLineTo(18.5346f)
                curveTo(18.948f, 22.0001f, 19.2932f, 22.0001f, 19.5766f, 21.9808f)
                curveTo(19.8715f, 21.9606f, 20.1502f, 21.9172f, 20.4203f, 21.8054f)
                curveTo(21.0471f, 21.5457f, 21.5451f, 21.0477f, 21.8047f, 20.4209f)
                curveTo(21.9166f, 20.1508f, 21.96f, 19.8721f, 21.9802f, 19.5772f)
                curveTo(21.9995f, 19.2938f, 21.9995f, 18.9486f, 21.9995f, 18.5352f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.6f, strokeAlpha
                = 0.6f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.6973f, 16.6156f)
                verticalLineTo(16.6512f)
                horizontalLineTo(14.0926f)
                curveTo(14.0926f, 15.9835f, 14.0935f, 15.5352f, 14.1282f, 15.1934f)
                curveTo(14.1618f, 14.8633f, 14.2212f, 14.7108f, 14.2886f, 14.6099f)
                curveTo(14.3734f, 14.4829f, 14.4824f, 14.3739f, 14.6094f, 14.2891f)
                curveTo(14.7103f, 14.2217f, 14.8628f, 14.1623f, 15.1929f, 14.1287f)
                curveTo(15.5347f, 14.0939f, 15.983f, 14.0931f, 16.6508f, 14.0931f)
                horizontalLineTo(18.5112f)
                verticalLineTo(12.6978f)
                horizontalLineTo(16.6151f)
                curveTo(15.9922f, 12.6977f, 15.4725f, 12.6977f, 15.0517f, 12.7405f)
                curveTo(14.6113f, 12.7853f, 14.2025f, 12.8827f, 13.8342f, 13.1289f)
                curveTo(13.5549f, 13.3155f, 13.315f, 13.5553f, 13.1284f, 13.8347f)
                curveTo(12.8823f, 14.203f, 12.7848f, 14.6118f, 12.74f, 15.0522f)
                curveTo(12.6972f, 15.473f, 12.6973f, 15.9927f, 12.6973f, 16.6156f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.5087f, 18.6903f)
                curveTo(5.727f, 18.8453f, 6.0363f, 18.8453f, 6.6548f, 18.8453f)
                curveTo(7.2733f, 18.8453f, 7.5825f, 18.8453f, 7.8009f, 18.6903f)
                curveTo(7.8779f, 18.6357f, 7.9452f, 18.5684f, 7.9999f, 18.4914f)
                curveTo(8.1548f, 18.273f, 8.1548f, 17.9638f, 8.1548f, 17.3453f)
                curveTo(8.1548f, 16.7268f, 8.1548f, 16.4175f, 7.9999f, 16.1992f)
                curveTo(7.9452f, 16.1221f, 7.8779f, 16.0549f, 7.8009f, 16.0002f)
                curveTo(7.5825f, 15.8453f, 7.2733f, 15.8453f, 6.6548f, 15.8453f)
                curveTo(6.0363f, 15.8453f, 5.727f, 15.8453f, 5.5087f, 16.0002f)
                curveTo(5.4317f, 16.0549f, 5.3644f, 16.1221f, 5.3097f, 16.1992f)
                curveTo(5.1548f, 16.4175f, 5.1548f, 16.7268f, 5.1548f, 17.3453f)
                curveTo(5.1548f, 17.9638f, 5.1548f, 18.273f, 5.3097f, 18.4914f)
                curveTo(5.3644f, 18.5684f, 5.4317f, 18.6357f, 5.5087f, 18.6903f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.6545f, 8.1549f)
                curveTo(6.036f, 8.1549f, 5.7268f, 8.1549f, 5.5085f, 7.9999f)
                curveTo(5.4314f, 7.9453f, 5.3641f, 7.878f, 5.3095f, 7.801f)
                curveTo(5.1545f, 7.5826f, 5.1545f, 7.2734f, 5.1545f, 6.6549f)
                curveTo(5.1545f, 6.0364f, 5.1545f, 5.7271f, 5.3095f, 5.5088f)
                curveTo(5.3641f, 5.4317f, 5.4314f, 5.3645f, 5.5085f, 5.3098f)
                curveTo(5.7268f, 5.1549f, 6.036f, 5.1549f, 6.6545f, 5.1549f)
                curveTo(7.273f, 5.1549f, 7.5823f, 5.1549f, 7.8006f, 5.3098f)
                curveTo(7.8777f, 5.3645f, 7.9449f, 5.4317f, 7.9996f, 5.5088f)
                curveTo(8.1545f, 5.7271f, 8.1545f, 6.0364f, 8.1545f, 6.6549f)
                curveTo(8.1545f, 7.2734f, 8.1545f, 7.5826f, 7.9996f, 7.801f)
                curveTo(7.9449f, 7.878f, 7.8777f, 7.9453f, 7.8006f, 7.9999f)
                curveTo(7.5823f, 8.1549f, 7.273f, 8.1549f, 6.6545f, 8.1549f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.1994f, 8.0001f)
                curveTo(16.4177f, 8.1551f, 16.727f, 8.1551f, 17.3455f, 8.1551f)
                curveTo(17.9639f, 8.1551f, 18.2732f, 8.1551f, 18.4915f, 8.0001f)
                curveTo(18.5686f, 7.9455f, 18.6359f, 7.8782f, 18.6905f, 7.8012f)
                curveTo(18.8455f, 7.5828f, 18.8455f, 7.2736f, 18.8455f, 6.6551f)
                curveTo(18.8455f, 6.0366f, 18.8455f, 5.7273f, 18.6905f, 5.509f)
                curveTo(18.6359f, 5.4319f, 18.5686f, 5.3647f, 18.4915f, 5.31f)
                curveTo(18.2732f, 5.1551f, 17.9639f, 5.1551f, 17.3455f, 5.1551f)
                curveTo(16.727f, 5.1551f, 16.4177f, 5.1551f, 16.1994f, 5.31f)
                curveTo(16.1223f, 5.3647f, 16.0551f, 5.4319f, 16.0004f, 5.509f)
                curveTo(15.8455f, 5.7273f, 15.8455f, 6.0366f, 15.8455f, 6.6551f)
                curveTo(15.8455f, 7.2736f, 15.8455f, 7.5828f, 16.0004f, 7.8012f)
                curveTo(16.0551f, 7.8782f, 16.1223f, 7.9455f, 16.1994f, 8.0001f)
                close()
            }
        }
            .build()
        return _qrCode!!
    }

private var _qrCode: ImageVector? = null
