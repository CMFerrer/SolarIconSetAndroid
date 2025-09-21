package dev.chiksmedina.solar.bold.security

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
import dev.chiksmedina.solar.bold.SecurityGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(16.5249f, 2.0f)
                horizontalLineTo(16.5932f)
                curveTo(17.477f, 2.0f, 18.1897f, 2.0f, 18.7635f, 2.0545f)
                curveTo(19.3552f, 2.1108f, 19.8707f, 2.23f, 20.3343f, 2.5141f)
                curveTo(20.8037f, 2.8017f, 21.1983f, 3.1963f, 21.486f, 3.6657f)
                curveTo(21.77f, 4.1293f, 21.8892f, 4.6448f, 21.9455f, 5.2365f)
                curveTo(22.0f, 5.8103f, 22.0f, 6.523f, 22.0f, 7.4068f)
                verticalLineTo(7.4752f)
                curveTo(22.0f, 8.0559f, 22.0f, 8.5405f, 21.9626f, 8.9341f)
                curveTo(21.9235f, 9.3456f, 21.8386f, 9.7291f, 21.623f, 10.0808f)
                curveTo(21.4121f, 10.425f, 21.1227f, 10.7144f, 20.7785f, 10.9254f)
                curveTo(20.4267f, 11.1409f, 20.0433f, 11.2258f, 19.6318f, 11.2649f)
                curveTo(19.2382f, 11.3024f, 18.7535f, 11.3023f, 18.1728f, 11.3023f)
                lineTo(17.0679f, 11.3023f)
                curveTo(16.2321f, 11.3024f, 15.5352f, 11.3024f, 14.9819f, 11.228f)
                curveTo(14.3979f, 11.1495f, 13.8706f, 10.9768f, 13.4469f, 10.5531f)
                curveTo(13.0232f, 10.1294f, 12.8505f, 9.6021f, 12.772f, 9.0181f)
                curveTo(12.6976f, 8.4648f, 12.6976f, 7.7679f, 12.6977f, 6.9321f)
                lineTo(12.6977f, 5.8273f)
                curveTo(12.6977f, 5.2465f, 12.6976f, 4.7618f, 12.7351f, 4.3682f)
                curveTo(12.7742f, 3.9567f, 12.8591f, 3.5733f, 13.0746f, 3.2215f)
                curveTo(13.2856f, 2.8773f, 13.575f, 2.5879f, 13.9192f, 2.377f)
                curveTo(14.2709f, 2.1614f, 14.6544f, 2.0765f, 15.0659f, 2.0374f)
                curveTo(15.4595f, 2.0f, 15.9442f, 2.0f, 16.5249f, 2.0f)
                close()
                moveTo(17.3488f, 7.814f)
                curveTo(16.8694f, 7.814f, 16.6297f, 7.814f, 16.4604f, 7.6939f)
                curveTo(16.4007f, 7.6515f, 16.3485f, 7.5993f, 16.3061f, 7.5396f)
                curveTo(16.186f, 7.3703f, 16.186f, 7.1306f, 16.186f, 6.6512f)
                curveTo(16.186f, 6.1717f, 16.186f, 5.932f, 16.3061f, 5.7627f)
                curveTo(16.3485f, 5.703f, 16.4007f, 5.6508f, 16.4604f, 5.6085f)
                curveTo(16.6297f, 5.4884f, 16.8694f, 5.4884f, 17.3488f, 5.4884f)
                curveTo(17.8283f, 5.4884f, 18.068f, 5.4884f, 18.2373f, 5.6085f)
                curveTo(18.297f, 5.6508f, 18.3491f, 5.703f, 18.3915f, 5.7627f)
                curveTo(18.5116f, 5.932f, 18.5116f, 6.1717f, 18.5116f, 6.6512f)
                curveTo(18.5116f, 7.1306f, 18.5116f, 7.3703f, 18.3915f, 7.5396f)
                curveTo(18.3491f, 7.5993f, 18.297f, 7.6515f, 18.2373f, 7.6939f)
                curveTo(18.068f, 7.814f, 17.8283f, 7.814f, 17.3488f, 7.814f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.0808f, 2.377f)
                curveTo(9.7291f, 2.1614f, 9.3456f, 2.0765f, 8.9341f, 2.0374f)
                curveTo(8.5405f, 2.0f, 8.0558f, 2.0f, 7.4751f, 2.0f)
                horizontalLineTo(7.4068f)
                curveTo(6.5231f, 2.0f, 5.8103f, 2.0f, 5.2365f, 2.0545f)
                curveTo(4.6448f, 2.1108f, 4.1293f, 2.23f, 3.6657f, 2.5141f)
                curveTo(3.1963f, 2.8017f, 2.8017f, 3.1963f, 2.5141f, 3.6657f)
                curveTo(2.23f, 4.1293f, 2.1108f, 4.6448f, 2.0545f, 5.2365f)
                curveTo(2.0f, 5.8103f, 2.0f, 6.523f, 2.0f, 7.4068f)
                verticalLineTo(7.4751f)
                curveTo(2.0f, 8.0558f, 2.0f, 8.5405f, 2.0374f, 8.9341f)
                curveTo(2.0765f, 9.3456f, 2.1614f, 9.7291f, 2.377f, 10.0808f)
                curveTo(2.5879f, 10.425f, 2.8773f, 10.7144f, 3.2215f, 10.9254f)
                curveTo(3.5733f, 11.1409f, 3.9567f, 11.2258f, 4.3682f, 11.2649f)
                curveTo(4.7618f, 11.3024f, 5.2464f, 11.3023f, 5.8271f, 11.3023f)
                lineTo(6.9321f, 11.3023f)
                curveTo(7.7679f, 11.3024f, 8.4648f, 11.3024f, 9.0181f, 11.228f)
                curveTo(9.6021f, 11.1495f, 10.1294f, 10.9768f, 10.5531f, 10.5531f)
                curveTo(10.9768f, 10.1294f, 11.1495f, 9.6021f, 11.228f, 9.0181f)
                curveTo(11.3024f, 8.4648f, 11.3024f, 7.7679f, 11.3023f, 6.9321f)
                lineTo(11.3023f, 5.8273f)
                curveTo(11.3023f, 5.2466f, 11.3024f, 4.7618f, 11.2649f, 4.3682f)
                curveTo(11.2258f, 3.9567f, 11.1409f, 3.5733f, 10.9254f, 3.2215f)
                curveTo(10.7144f, 2.8773f, 10.425f, 2.5879f, 10.0808f, 2.377f)
                close()
                moveTo(5.7627f, 7.6939f)
                curveTo(5.932f, 7.814f, 6.1717f, 7.814f, 6.6512f, 7.814f)
                curveTo(7.1306f, 7.814f, 7.3703f, 7.814f, 7.5396f, 7.6939f)
                curveTo(7.5993f, 7.6515f, 7.6515f, 7.5993f, 7.6939f, 7.5396f)
                curveTo(7.814f, 7.3703f, 7.814f, 7.1306f, 7.814f, 6.6512f)
                curveTo(7.814f, 6.1717f, 7.814f, 5.932f, 7.6939f, 5.7627f)
                curveTo(7.6515f, 5.703f, 7.5993f, 5.6508f, 7.5396f, 5.6085f)
                curveTo(7.3703f, 5.4884f, 7.1306f, 5.4884f, 6.6512f, 5.4884f)
                curveTo(6.1717f, 5.4884f, 5.932f, 5.4884f, 5.7627f, 5.6085f)
                curveTo(5.703f, 5.6508f, 5.6508f, 5.703f, 5.6085f, 5.7627f)
                curveTo(5.4884f, 5.932f, 5.4884f, 6.1717f, 5.4884f, 6.6512f)
                curveTo(5.4884f, 7.1306f, 5.4884f, 7.3703f, 5.6085f, 7.5396f)
                curveTo(5.6508f, 7.5993f, 5.703f, 7.6515f, 5.7627f, 7.6939f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.0181f, 12.772f)
                curveTo(9.6021f, 12.8505f, 10.1294f, 13.0232f, 10.5531f, 13.4469f)
                curveTo(10.9768f, 13.8706f, 11.1495f, 14.3979f, 11.228f, 14.9819f)
                curveTo(11.3024f, 15.5352f, 11.3024f, 16.2321f, 11.3023f, 17.0679f)
                lineTo(11.3023f, 18.1728f)
                curveTo(11.3023f, 18.7535f, 11.3024f, 19.2382f, 11.2649f, 19.6318f)
                curveTo(11.2258f, 20.0433f, 11.1409f, 20.4267f, 10.9254f, 20.7785f)
                curveTo(10.7144f, 21.1227f, 10.425f, 21.4121f, 10.0808f, 21.623f)
                curveTo(9.7291f, 21.8386f, 9.3456f, 21.9235f, 8.9341f, 21.9626f)
                curveTo(8.5405f, 22.0f, 8.0558f, 22.0f, 7.4751f, 22.0f)
                horizontalLineTo(7.4068f)
                curveTo(6.523f, 22.0f, 5.8103f, 22.0f, 5.2365f, 21.9455f)
                curveTo(4.6448f, 21.8892f, 4.1293f, 21.77f, 3.6657f, 21.486f)
                curveTo(3.1963f, 21.1983f, 2.8017f, 20.8037f, 2.5141f, 20.3343f)
                curveTo(2.23f, 19.8707f, 2.1108f, 19.3552f, 2.0545f, 18.7635f)
                curveTo(2.0f, 18.1897f, 2.0f, 17.477f, 2.0f, 16.5932f)
                verticalLineTo(16.5249f)
                curveTo(2.0f, 15.9442f, 2.0f, 15.4595f, 2.0374f, 15.0659f)
                curveTo(2.0765f, 14.6544f, 2.1614f, 14.2709f, 2.377f, 13.9192f)
                curveTo(2.5879f, 13.575f, 2.8773f, 13.2856f, 3.2215f, 13.0746f)
                curveTo(3.5733f, 12.8591f, 3.9567f, 12.7742f, 4.3682f, 12.7351f)
                curveTo(4.7618f, 12.6976f, 5.2465f, 12.6977f, 5.8272f, 12.6977f)
                lineTo(6.9321f, 12.6977f)
                curveTo(7.7679f, 12.6976f, 8.4648f, 12.6976f, 9.0181f, 12.772f)
                close()
                moveTo(6.6512f, 18.5116f)
                curveTo(6.1717f, 18.5116f, 5.932f, 18.5116f, 5.7627f, 18.3915f)
                curveTo(5.703f, 18.3491f, 5.6508f, 18.297f, 5.6085f, 18.2373f)
                curveTo(5.4884f, 18.068f, 5.4884f, 17.8283f, 5.4884f, 17.3488f)
                curveTo(5.4884f, 16.8694f, 5.4884f, 16.6297f, 5.6085f, 16.4604f)
                curveTo(5.6508f, 16.4007f, 5.703f, 16.3485f, 5.7627f, 16.3061f)
                curveTo(5.932f, 16.186f, 6.1717f, 16.186f, 6.6512f, 16.186f)
                curveTo(7.1306f, 16.186f, 7.3703f, 16.186f, 7.5396f, 16.3061f)
                curveTo(7.5993f, 16.3485f, 7.6515f, 16.4007f, 7.6939f, 16.4604f)
                curveTo(7.814f, 16.6297f, 7.814f, 16.8694f, 7.814f, 17.3488f)
                curveTo(7.814f, 17.8283f, 7.814f, 18.068f, 7.6939f, 18.2373f)
                curveTo(7.6515f, 18.297f, 7.5993f, 18.3491f, 7.5396f, 18.3915f)
                curveTo(7.3703f, 18.5116f, 7.1306f, 18.5116f, 6.6512f, 18.5116f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.6977f, 16.6155f)
                verticalLineTo(16.6512f)
                horizontalLineTo(14.093f)
                curveTo(14.093f, 15.9834f, 14.0939f, 15.5351f, 14.1286f, 15.1933f)
                curveTo(14.1622f, 14.8632f, 14.2216f, 14.7107f, 14.289f, 14.6098f)
                curveTo(14.3738f, 14.4828f, 14.4828f, 14.3738f, 14.6098f, 14.289f)
                curveTo(14.7107f, 14.2216f, 14.8632f, 14.1622f, 15.1933f, 14.1286f)
                curveTo(15.5351f, 14.0939f, 15.9834f, 14.093f, 16.6512f, 14.093f)
                horizontalLineTo(18.5116f)
                verticalLineTo(12.6977f)
                horizontalLineTo(16.6155f)
                curveTo(15.9926f, 12.6977f, 15.4729f, 12.6976f, 15.0521f, 12.7404f)
                curveTo(14.6117f, 12.7853f, 14.203f, 12.8827f, 13.8346f, 13.1288f)
                curveTo(13.5553f, 13.3154f, 13.3154f, 13.5553f, 13.1288f, 13.8346f)
                curveTo(12.8827f, 14.203f, 12.7853f, 14.6117f, 12.7404f, 15.0521f)
                curveTo(12.6976f, 15.4729f, 12.6977f, 15.9926f, 12.6977f, 16.6155f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(22.0f, 18.5351f)
                verticalLineTo(18.5116f)
                horizontalLineTo(20.6046f)
                curveTo(20.6046f, 18.9546f, 20.6043f, 19.2519f, 20.5886f, 19.4821f)
                curveTo(20.5733f, 19.706f, 20.5459f, 19.8151f, 20.5161f, 19.8868f)
                curveTo(20.3981f, 20.1718f, 20.1718f, 20.3981f, 19.8868f, 20.5161f)
                curveTo(19.8151f, 20.5459f, 19.706f, 20.5733f, 19.4821f, 20.5886f)
                curveTo(19.2519f, 20.6043f, 18.9546f, 20.6046f, 18.5116f, 20.6046f)
                horizontalLineTo(16.6512f)
                verticalLineTo(22.0f)
                horizontalLineTo(18.5351f)
                curveTo(18.9486f, 22.0f, 19.2937f, 22.0f, 19.5771f, 21.9807f)
                curveTo(19.8721f, 21.9606f, 20.1507f, 21.9172f, 20.4208f, 21.8053f)
                curveTo(21.0476f, 21.5456f, 21.5456f, 21.0476f, 21.8053f, 20.4208f)
                curveTo(21.9172f, 20.1507f, 21.9606f, 19.8721f, 21.9807f, 19.5771f)
                curveTo(22.0f, 19.2937f, 22.0f, 18.9486f, 22.0f, 18.5351f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.093f, 21.3023f)
                curveTo(14.093f, 21.6876f, 13.7807f, 22.0f, 13.3953f, 22.0f)
                curveTo(13.01f, 22.0f, 12.6977f, 21.6876f, 12.6977f, 21.3023f)
                verticalLineTo(18.5116f)
                horizontalLineTo(14.093f)
                verticalLineTo(21.3023f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(21.3023f, 12.6977f)
                curveTo(20.917f, 12.6977f, 20.6046f, 13.01f, 20.6046f, 13.3953f)
                verticalLineTo(16.6512f)
                horizontalLineTo(22.0f)
                verticalLineTo(13.3953f)
                curveTo(22.0f, 13.01f, 21.6876f, 12.6977f, 21.3023f, 12.6977f)
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
        }
            .build()
        return _qrCode!!
    }

private var _qrCode: ImageVector? = null
